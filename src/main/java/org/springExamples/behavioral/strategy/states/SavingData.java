package org.springExamples.behavioral.strategy.states;

public class SavingData implements Activity {
    @Override
    public void doAct() {
        System.out.println("saving data");
    }
}
