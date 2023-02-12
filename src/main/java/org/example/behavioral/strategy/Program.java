package org.example.behavioral.strategy;

import org.example.behavioral.strategy.states.*;

public class Program {
    private Activity activity;

    public Activity getActivity() {
        return this.activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void doCurrentAction() {
        activity.doAct();
    }
}
