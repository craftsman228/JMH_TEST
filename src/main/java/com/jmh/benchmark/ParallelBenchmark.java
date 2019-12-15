package com.jmh.benchmark;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.LongStream;
import java.util.stream.Stream;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(value = 2, jvmArgs={"-Xms4G", "-Xmx4G"})
public class ParallelBenchmark {

    public static final long N = 10000000L;

    @Benchmark
    public long suquestionalSum() {
        return Stream.iterate(1L , i -> i + 1)
                     .limit(N)
                     .reduce(0L, Long::sum);
    }

    @Benchmark
    public long rangedSum() {
        return LongStream.rangeClosed(1, N).reduce(0L, Long::sum);
    }

    @Benchmark
    public long rangedParallelSun() {
        return LongStream.rangeClosed(1, N).parallel().reduce(0L, Long::sum);
    }
}
