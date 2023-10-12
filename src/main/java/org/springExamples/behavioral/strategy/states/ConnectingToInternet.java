package org.springExamples.behavioral.strategy.states;

public class ConnectingToInternet implements Activity {
    @Override
    public void doAct() {
        System.out.println("connecting to internet");
    }
}
