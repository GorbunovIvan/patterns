package org.springExamples.structural.bridge.devices;

import org.springExamples.structural.bridge.activities.Activity;

public class Computer extends Device {

    public Computer(Activity activity) {
        super(activity);
    }

    @Override
    public void makeUse() {
        activity.act();
        System.out.println(" on computer");
    }
}
