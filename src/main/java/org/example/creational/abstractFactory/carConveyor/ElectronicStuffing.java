package org.example.creational.abstractFactory.carConveyor;

import org.example.creational.abstractFactory.abstractConveyor.Stuffing;

public class ElectronicStuffing implements Stuffing {
    @Override
    public void stuff() {
        System.out.println("stuffing with electronics");
    }
}
