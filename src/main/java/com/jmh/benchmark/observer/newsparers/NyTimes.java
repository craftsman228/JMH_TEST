package com.jmh.benchmark.observer.newsparers;

import com.jmh.benchmark.observer.Observer;

public class NyTimes implements Observer {
    @Override
    public void notify(String tweet) {
        if (tweet != null && tweet.contains("money")){
            System.out.println("Breaking news in NY " + tweet);
        }
    }
}
