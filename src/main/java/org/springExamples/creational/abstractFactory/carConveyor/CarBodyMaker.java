package org.springExamples.creational.abstractFactory.carConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.BodyMaker;

public class CarBodyMaker implements BodyMaker {

    @Override
    public void makeBody() {
        System.out.println("making car body");
    }
}
