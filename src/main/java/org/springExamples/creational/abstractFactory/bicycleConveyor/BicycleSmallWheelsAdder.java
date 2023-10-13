package org.springExamples.creational.abstractFactory.bicycleConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.WheelsAdder;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BicycleSmallWheelsAdder implements WheelsAdder {
    @Override
    public void addWheels() {
        System.out.println("adding small cycle wheels");
    }
}
