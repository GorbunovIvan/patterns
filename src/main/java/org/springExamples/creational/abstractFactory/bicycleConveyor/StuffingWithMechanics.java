package org.springExamples.creational.abstractFactory.bicycleConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.Stuffing;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class StuffingWithMechanics implements Stuffing {
    @Override
    public void stuff() {
        System.out.println("stuffing with mechanics");
    }
}
