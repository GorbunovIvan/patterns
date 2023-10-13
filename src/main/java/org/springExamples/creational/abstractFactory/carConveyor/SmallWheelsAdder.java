package org.springExamples.creational.abstractFactory.carConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.WheelsAdder;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SmallWheelsAdder implements WheelsAdder {
    public void addWheels() {
        System.out.println("adding small wheels");
    }
}
