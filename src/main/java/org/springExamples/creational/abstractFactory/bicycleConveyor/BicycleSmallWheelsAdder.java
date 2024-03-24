package org.springExamples.creational.abstractFactory.bicycleConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.WheelsAdder;
import org.springframework.stereotype.Component;

@Component
public class BicycleSmallWheelsAdder implements WheelsAdder {
    @Override
    public void addWheels() {
        System.out.println("adding small cycle wheels");
    }
}
