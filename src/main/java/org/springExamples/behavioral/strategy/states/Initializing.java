package org.springExamples.behavioral.strategy.states;

public class Initializing implements Activity {

    @Override
    public void doAct() {
        System.out.println("turning on");
    }
}
