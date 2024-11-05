package org.springExamples.behavioral.strategy.states;

import org.springframework.stereotype.Component;

@Component
public class Initializing implements Activity {

    @Override
    public void doAct() {
        System.out.println("turning on");
    }
}
