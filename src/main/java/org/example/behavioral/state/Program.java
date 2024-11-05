package org.example.behavioral.state;

import org.example.behavioral.state.states.*;

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

    public void setNextActivity() {
        if (activity == null) {
            activity = new Initializing();
        } else if (activity instanceof Initializing) {
            activity = new ConnectingToInternet();
        } else if (activity instanceof ConnectingToInternet) {
            activity = new ParsingData();
        } else if (activity instanceof ParsingData) {
            activity = new SavingData();
        } else if (activity instanceof SavingData) {
            activity = new ShuttingDown();
        } else {
            activity = null;
        }
    }
}
