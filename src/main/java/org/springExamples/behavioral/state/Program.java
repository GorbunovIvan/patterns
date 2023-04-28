package org.springExamples.behavioral.state;

import org.springExamples.behavioral.state.states.*;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Program implements ApplicationContextAware {

    private Activity activity;

    private ApplicationContext context;

    @Override
    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
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
            activity = context.getBean(Initializing.class);
        else if (activity instanceof Initializing)
            activity = context.getBean(ConnectingToInternet.class);
        else if (activity instanceof ConnectingToInternet)
            activity = context.getBean(ParsingData.class);
        else if (activity instanceof ParsingData)
            activity = context.getBean(SavingData.class);
        else if (activity instanceof SavingData)
            activity = context.getBean(ShuttingDown.class);
        else
            activity = null;
    }
}
