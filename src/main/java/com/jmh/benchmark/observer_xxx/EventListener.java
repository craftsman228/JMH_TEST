package com.jmh.benchmark.observer_xxx;

public interface EventListener<T> {
    void update(T t);
}
