package org.springExamples.behavioral.state;

import org.springExamples.behavioral.state.states.*;
import org.springframework.stereotype.Component;

@Component
public class Program {

    private final Initializing initializing;
    private final ConnectingToInternet connectingToInternet;
    private final ParsingData parsingData;
    private final SavingData savingData;
    private final ShuttingDown shuttingDown;

    private Activity activity;

    public Program(Initializing initializing, ConnectingToInternet connectingToInternet,
                   ParsingData parsingData, SavingData savingData,
                   ShuttingDown shuttingDown) {

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
