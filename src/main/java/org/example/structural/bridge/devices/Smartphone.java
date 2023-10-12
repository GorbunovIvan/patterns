package org.example.structural.bridge.devices;

import org.example.structural.bridge.activities.Activity;

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
