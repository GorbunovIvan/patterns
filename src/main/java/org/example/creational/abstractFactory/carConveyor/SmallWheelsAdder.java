package org.example.creational.abstractFactory.carConveyor;

import org.example.creational.abstractFactory.abstractConveyor.WheelsAdder;

public class SmallWheelsAdder implements WheelsAdder {

    @Override
    public void addWheels() {
        System.out.println("adding small wheels");
    }
}
