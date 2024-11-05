package org.example.creational.abstractFactory.bicycleConveyor;

import org.example.creational.abstractFactory.abstractConveyor.BodyMaker;

public class BicycleBodyMaker implements BodyMaker {

    @Override
    public void makeBody() {
        System.out.println("making bicycle body");
    }
}
