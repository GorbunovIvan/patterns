package org.springExamples.creational.abstractFactory.bicycleConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.WheelsAdder;

public class BicycleSmallWheelsAdder implements WheelsAdder {

    @Override
    public void addWheels() {
        System.out.println("adding 2 small cycle wheels");
    }
}
