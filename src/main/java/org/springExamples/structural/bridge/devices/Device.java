package org.springExamples.structural.bridge.devices;

import org.springExamples.structural.bridge.activities.Activity;

public abstract class Device {

    protected Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public abstract void makeUse();
}
