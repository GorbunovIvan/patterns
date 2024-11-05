package org.springExamples.creational.abstractFactory.bicycleConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.Stuffing;

public class StuffingWithMechanics implements Stuffing {

    @Override
    public void stuff() {
        System.out.println("stuffing with mechanics");
    }
}
