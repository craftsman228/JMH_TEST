package com.jmh.benchmark.observer_xx;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
