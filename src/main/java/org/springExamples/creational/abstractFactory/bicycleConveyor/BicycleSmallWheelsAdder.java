package org.springExamples.creational.abstractFactory.bicycleConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.WheelsAdder;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BicycleSmallWheelsAdder implements WheelsAdder {

    @Override
    public void addWheels() {
        System.out.println("adding 2 small cycle wheels");
    }
}
