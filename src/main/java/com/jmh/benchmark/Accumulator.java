package com.jmh.benchmark;

import java.util.stream.LongStream;

public class Accumulator {

    public static long total = 0;

    public static void sum(long value) {
        total += value;
    }

    public long sideEffectSum(long n){
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n).parallel().forEach(Accumulator::sum);
        return accumulator.total;
    }
}
