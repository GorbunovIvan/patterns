package org.springExamples.structural.flyweight.beans;

import org.springframework.stereotype.Component;

@Component("washing machine")
public class WashingMachine implements Appliances {
    @Override
    public void work() {
        System.out.println("washing clothes");
    }
}
