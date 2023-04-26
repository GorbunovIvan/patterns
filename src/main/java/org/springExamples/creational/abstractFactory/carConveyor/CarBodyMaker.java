package org.springExamples.creational.abstractFactory.carConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.BodyMaker;
import org.springframework.stereotype.Component;

@Component
public class CarBodyMaker implements BodyMaker {
    public void makeBody() {
        System.out.println("making car body");
    }
}
