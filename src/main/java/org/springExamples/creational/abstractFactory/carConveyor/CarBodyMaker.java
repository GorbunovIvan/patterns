package org.springExamples.creational.abstractFactory.carConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.BodyMaker;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CarBodyMaker implements BodyMaker {
    public void makeBody() {
        System.out.println("making car body");
    }
}
