package org.springExamples.structural.flyweight;

public class WashingMachine implements Appliances {
    @Override
    public void work() {
        System.out.println("washing clothes");
    }
}
