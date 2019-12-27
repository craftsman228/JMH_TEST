package com.jmh.benchmark.observer_xxx.impl;

import com.jmh.benchmark.observer_xxx.EventListener;
import com.jmh.benchmark.observer_xxx.external.ExternalProfile;

public class ExternalProfileUpdateListner implements EventListener<ExternalProfile> {
    @Override
    public void update(ExternalProfile externalProfile) {
        System.out.println("Updation External Guest Profile");
    }
}
