package com.jmh.benchmark.observer.newsparers;

import com.jmh.benchmark.observer.Observer;

public class Guardian implements Observer {
    @Override
    public void notify(String tweet) {
        if (tweet != null && tweet.contains("queen")){
            System.out.println("Queen arrives to GB " + tweet);
        }
    }
}
