package org.springExamples.behavioral.strategy;

import org.springExamples.behavioral.strategy.states.Activity;

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
