package org.springExamples.structural.flyweight;

public class Fridge implements Appliances {

    @Override
    public void work() {
        System.out.println("freezing the food");
    }
}
