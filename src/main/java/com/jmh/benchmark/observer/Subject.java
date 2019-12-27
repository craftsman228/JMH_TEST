package com.jmh.benchmark.observer;

public interface Subject {
    void registerObserver(Observer o);
    void notifyObservers(String tweet);
}
