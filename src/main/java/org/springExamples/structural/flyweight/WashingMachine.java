package org.springExamples.structural.flyweight;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component("washing machine")
public class WashingMachine implements Appliances {

    @PostConstruct
    public void init() {
        System.out.println("adding washing machine");
    }

    @Override
    public void work() {
        System.out.println("washing clothes");
    }
}
