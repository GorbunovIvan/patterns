package org.springExamples.structural.composite;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SmallWindow implements Window {
    @Override
    public void buildWindow() {
        System.out.println("        building small window");
    }
}
