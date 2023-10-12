package org.example.structural.bridge.devices;

import org.example.structural.bridge.activities.Activity;

public abstract class Device {

    protected final Activity activity;

    protected Device(Activity activity) {
        this.activity = activity;
    }

    public abstract void makeUse();
}
