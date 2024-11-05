package org.example.creational.abstractFactory.carConveyor;

import org.example.creational.abstractFactory.abstractConveyor.BodyMaker;

public class CarBodyMaker implements BodyMaker {

    @Override
    public void makeBody() {
        System.out.println("making car body");
    }
}
