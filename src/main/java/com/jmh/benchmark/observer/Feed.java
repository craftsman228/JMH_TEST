package com.jmh.benchmark.observer;

import com.jmh.benchmark.observer.newsparers.Guardian;
import com.jmh.benchmark.observer.newsparers.NyTimes;

import java.util.ArrayList;
import java.util.List;

public class Feed implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void notifyObservers(String tweet) {
        observers.forEach(o -> o.notify(tweet));
    }

    public static void main(String[] args) {
        Feed feed = new Feed();
        feed.registerObserver(new Guardian());
        feed.registerObserver(new NyTimes());
        feed.notifyObservers("money comes to us motherfacker!");
    }
}
