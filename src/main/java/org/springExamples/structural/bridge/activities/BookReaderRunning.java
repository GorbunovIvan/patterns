package org.springExamples.structural.bridge.activities;

public class BookReaderRunning implements Activity {

    @Override
    public void act() {
        System.out.print("running book reader");
    }
}
