package org.springExamples.behavioral.state;

import org.springExamples.behavioral.state.states.*;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Program implements ApplicationContextAware {

    private Activity activity;

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
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
        if (activity == null)
            activity = applicationContext.getBean(Initializing.class);
        else if (activity instanceof Initializing)
            activity = applicationContext.getBean(ConnectingToInternet.class);
        else if (activity instanceof ConnectingToInternet)
            activity = applicationContext.getBean(ParsingData.class);
        else if (activity instanceof ParsingData)
            activity = applicationContext.getBean(SavingData.class);
        else if (activity instanceof SavingData)
            activity = applicationContext.getBean(ShuttingDown.class);
        else
            activity = null;
    }
}
