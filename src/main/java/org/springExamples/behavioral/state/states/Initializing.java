package org.springExamples.behavioral.state.states;

public class Initializing implements Activity {

    @Override
    public void doAct() {
        System.out.println("turning on");
    }
}
