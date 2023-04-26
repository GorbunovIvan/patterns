package org.springExamples.creational.abstractFactory.carConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.WheelsAdder;
import org.springframework.stereotype.Component;

@Component
public class SmallWheelsAdder implements WheelsAdder {
    public void addWheels() {
        System.out.println("adding small wheels");
    }
}
