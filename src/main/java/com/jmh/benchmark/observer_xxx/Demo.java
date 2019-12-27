package com.jmh.benchmark.observer_xxx;

import com.jmh.benchmark.observer_xxx.datamart.Datamart;
import com.jmh.benchmark.observer_xxx.impl.ExternalProfileUpdateListner;

public class Demo {
    public static void main(String[] args) {
        Datamart datamart = new Datamart();
        datamart.events.subscribe("update_external_profile", new ExternalProfileUpdateListner());

        datamart.updateDatamart();
    }
}
