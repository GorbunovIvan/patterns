package org.springExamples.structural.bridge.devices;

import org.springExamples.structural.bridge.activities.Activity;

public abstract class Device {

    protected Activity activity;

    protected Device(Activity activity) {
        this.activity = activity;
    }

    public abstract void makeUse();
}
