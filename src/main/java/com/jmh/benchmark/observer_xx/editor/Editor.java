package com.jmh.benchmark.observer_xx.editor;

import com.jmh.benchmark.observer_xx.EventManager;

import java.io.File;

public class Editor {

    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("save", "open");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile(){
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new RuntimeException("Please open a file first");
        }
    }
}
