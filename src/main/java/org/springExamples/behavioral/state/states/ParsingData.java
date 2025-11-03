package org.springExamples.behavioral.state.states;

import org.springframework.stereotype.Component;

@Component
public class ParsingData implements Activity {

    @Override
    public void doAct() {
        System.out.println("parsing data");
    }
}
