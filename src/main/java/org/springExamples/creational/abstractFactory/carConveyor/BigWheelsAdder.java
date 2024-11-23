package org.springExamples.creational.abstractFactory.carConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.WheelsAdder;

public class BigWheelsAdder implements WheelsAdder {

    @Override
    public void addWheels() {
        System.out.println("adding 4 big wheels");
    }
}
