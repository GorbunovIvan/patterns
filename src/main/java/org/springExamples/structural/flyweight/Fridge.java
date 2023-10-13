package org.springExamples.structural.flyweight;

import org.springframework.stereotype.Component;

@Component("fridge")
public class Fridge implements Appliances {
    @Override
    public void work() {
        System.out.println("freezing the food");
    }
}
