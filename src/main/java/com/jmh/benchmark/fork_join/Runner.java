package com.jmh.benchmark.fork_join;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

public class Runner {

    public static long forkJoinSum(int n) {
        long[] numbers = LongStream.range(0, n).toArray();
        ForkJoinTask<Long> tasks = new ForkJoinCalculator(numbers);
        return new ForkJoinPool().invoke(tasks);
    }

    public static void main(String[] args) {
        System.out.println(forkJoinSum(1000000));
    }
}
