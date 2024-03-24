package org.springExamples.structural.bridge.activities;

import org.springframework.stereotype.Component;

@Component
public class BookReaderRunning implements Activity {
    @Override
    public void act() {
        System.out.print("running book reader");
    }
}
