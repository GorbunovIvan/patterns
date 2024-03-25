package org.springExamples.structural.flyweight;

import org.springframework.stereotype.Component;

@Component("washing machine")
public class WashingMachine implements Appliances {

    public WashingMachine() {
        System.out.println("adding washing machine");
    }

    @Override
    public void work() {
        System.out.println("washing clothes");
    }
}
