package com.jmh.benchmark.observer_xx;

import com.jmh.benchmark.observer_xx.editor.Editor;
import com.jmh.benchmark.observer_xx.listeners.EmailNotificationListener;
import com.jmh.benchmark.observer_xx.listeners.LogOpenListener;

public class Runner {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("C:\\Users\\User\\Desktop\\Warrior\\middle"));
        editor.events.subscribe("save", new EmailNotificationListener("kotto@gmail.com"));

        try {
            editor.openFile("C:\\Users\\User\\Desktop\\Warrior\\middle");
            editor.saveFile();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
