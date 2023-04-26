package org.springExamples.structural.bridge.devices;

import org.springExamples.structural.bridge.activities.Activity;

public class Smartphone extends Device {

    public Smartphone(Activity activity) {
        super(activity);
    }

    @Override
    public void makeUse() {
        activity.act();
        System.out.println(" on smartphone");
    }
}
