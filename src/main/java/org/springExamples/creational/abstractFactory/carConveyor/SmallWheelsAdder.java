package org.springExamples.creational.abstractFactory.carConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.WheelsAdder;

public class SmallWheelsAdder implements WheelsAdder {

    @Override
    public void addWheels() {
        System.out.println("adding small wheels");
    }
}
