package org.springExamples.structural.bridge.activities;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BookReaderRunning implements Activity {

    @Override
    public void act() {
        System.out.print("running book reader");
    }
}
