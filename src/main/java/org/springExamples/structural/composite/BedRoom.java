package org.springExamples.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class BedRoom implements Room {

    private final List<Window> windows = new ArrayList<>();

    public void addWindow(Window window) {
        windows.add(window);
    }

    @Override
    public void buildRoom() {
        System.out.println("    building bedroom");
        for (var window : windows)
            window.buildWindow();
    }
}
