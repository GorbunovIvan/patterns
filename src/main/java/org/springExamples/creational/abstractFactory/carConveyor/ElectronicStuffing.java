package org.springExamples.creational.abstractFactory.carConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.Stuffing;

public class ElectronicStuffing implements Stuffing {
    @Override
    public void stuff() {
        System.out.println("stuffing with electronics");
    }
}
