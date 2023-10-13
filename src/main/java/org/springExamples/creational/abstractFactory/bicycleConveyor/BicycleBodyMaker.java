package org.springExamples.creational.abstractFactory.bicycleConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.BodyMaker;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BicycleBodyMaker implements BodyMaker {
    @Override
    public void makeBody() {
        System.out.println("making bicycle body");
    }
}
