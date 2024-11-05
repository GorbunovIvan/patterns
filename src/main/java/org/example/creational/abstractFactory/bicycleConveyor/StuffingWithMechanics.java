package org.example.creational.abstractFactory.bicycleConveyor;

import org.example.creational.abstractFactory.abstractConveyor.Stuffing;

public class StuffingWithMechanics implements Stuffing {

    @Override
    public void stuff() {
        System.out.println("stuffing with mechanics");
    }
}
