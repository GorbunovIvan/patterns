package org.springExamples.structural.bridge.devices;

import org.springframework.stereotype.Component;

@Component
public class Smartphone extends Device {

    @Override
    public void makeUse() {
        activity.act();
        System.out.println(" on smartphone");
    }
}
