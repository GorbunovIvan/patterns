package org.springExamples.structural.flyweight;

import org.springframework.stereotype.Component;

@Component
public class Fridge implements Appliances {

    public Fridge() {
        System.out.println("adding fridge");
    }

    @Override
    public void work() {
        System.out.println("freezing the food");
    }
}
