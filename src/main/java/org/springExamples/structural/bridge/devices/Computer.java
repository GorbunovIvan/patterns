package org.springExamples.structural.bridge.devices;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Computer extends Device {
    @Override
    public void makeUse() {
        activity.act();
        System.out.println(" on computer");
    }
}
