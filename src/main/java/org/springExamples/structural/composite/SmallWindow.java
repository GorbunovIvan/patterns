package org.springExamples.structural.composite;

public class SmallWindow implements Window {
    @Override
    public void buildWindow() {
        System.out.println("        building small window");
    }
}
