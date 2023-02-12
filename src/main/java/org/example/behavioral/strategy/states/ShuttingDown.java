package org.example.behavioral.strategy.states;

public class ShuttingDown implements Activity {
    @Override
    public void doAct() {
        System.out.println("shutting down");
    }
}
