package org.springExamples.creational.abstractFactory.bicycleConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.BodyMaker;

public class BicycleBodyMaker implements BodyMaker {

    @Override
    public void makeBody() {
        System.out.println("making bicycle body");
    }
}
