package com.jmh.benchmark.fork_join;

import java.util.concurrent.RecursiveTask;

public class ForkJoinCalculator extends RecursiveTask<Long> {

    private final long[] numbers;
    private final int start;
    private final int end;

    public static final long THRESHOLD  = 10_000;

    public ForkJoinCalculator(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    public ForkJoinCalculator(long[] numbers){
        this(numbers, 0, numbers.length);
    }

    @Override
    protected Long compute() {
        int lenght = end - start;
        if (lenght < THRESHOLD) {
            return computeSequentially();
        }
        ForkJoinCalculator leftTask = new ForkJoinCalculator(numbers, start, start + lenght / 2);
        leftTask.fork();
        ForkJoinCalculator rightTask = new ForkJoinCalculator(numbers, start + lenght / 2, end);
        Long rightResult = rightTask.compute();
        Long leftResult = leftTask.join();
        return rightResult + leftResult;
    }

    private long computeSequentially() {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
