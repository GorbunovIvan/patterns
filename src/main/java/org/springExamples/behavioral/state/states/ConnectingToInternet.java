package org.springExamples.behavioral.state.states;

import org.springframework.stereotype.Component;

@Component
public class ConnectingToInternet implements Activity {
    @Override
    public void doAct() {
        System.out.println("connecting to internet");
    }
}