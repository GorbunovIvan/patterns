package org.springExamples.behavioral.state;

import org.springExamples.behavioral.state.states.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Program {

    private Activity activity;

    private final Activity initializing;
    private final Activity connectingToInternet;
    private final Activity parsingData;
    private final Activity savingData;
    private final Activity shuttingDown;

    public Program(@Qualifier("initializing") Activity initializing,
                   @Qualifier("connectingToInternet") Activity connectingToInternet,
                   @Qualifier("parsingData") Activity parsingData,
                   @Qualifier("savingData") Activity savingData,
                   @Qualifier("shuttingDown") Activity shuttingDown) {

        this.initializing = initializing;
        this.connectingToInternet = connectingToInternet;
        this.parsingData = parsingData;
        this.savingData = savingData;
        this.shuttingDown = shuttingDown;

        setNextActivity();
    }

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
            activity = initializing;
        } else if (activity instanceof Initializing) {
            activity = connectingToInternet;
        } else if (activity instanceof ConnectingToInternet) {
            activity = parsingData;
        } else if (activity instanceof ParsingData) {
            activity = savingData;
        } else if (activity instanceof SavingData) {
            activity = shuttingDown;
        } else {
            activity = null;
        }
    }
}
