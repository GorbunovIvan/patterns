package org.springExamples.structural.flyweight;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Fridge implements Appliances {

    @PostConstruct
    public void init() {
        System.out.println("adding fridge");
    }

    @Override
    public void work() {
        System.out.println("freezing the food");
    }
}
