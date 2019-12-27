package com.jmh.benchmark.observer_xxx.datamart;

import com.jmh.benchmark.observer_xxx.EventManager;
import com.jmh.benchmark.observer_xxx.external.ExternalProfile;
import com.jmh.benchmark.observer_xxx.impl.ExternalProfileUpdateListner;

public class Datamart {

    public EventManager events;
    private ExternalProfile externalProfile;

    public Datamart() {
        this.events = new EventManager("update_external_profile");
    }

    public void updateDatamart() {
        externalProfile = new ExternalProfile("8888", "GOLD");
        events.notify("update_external_profile", externalProfile);
    }
}
