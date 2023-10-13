package org.springExamples.structural.bridge.devices;

import org.springframework.stereotype.Component;

@Component
public class Computer extends Device {

    @Override
    public void makeUse() {
        activity.act();
        System.out.println(" on computer");
    }
}
