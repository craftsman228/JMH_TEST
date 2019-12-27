package com.jmh.benchmark.observer_xxx;

import com.jmh.benchmark.observer_xxx.external.ExternalProfile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listener = new HashMap<>();

    public EventManager(String...operations) {
        for (String operation: operations) {
            listener.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener<ExternalProfile> eventListener) {
        List<EventListener> users = listener.get(eventType);
        users.add(eventListener);
    }

    public void unsubscribe(String eventType, EventListener<ExternalProfile> eventListener) {
        List<EventListener> users = listener.get(eventType);
        users.remove(eventListener);
    }

    public void notify(String eventType, ExternalProfile externalProfile) {
        List<EventListener> users = listener.get(eventType);
        for (EventListener listener: users) {
            listener.update(externalProfile);
        }
    }
}
