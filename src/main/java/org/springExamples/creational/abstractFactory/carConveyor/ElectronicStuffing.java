package org.springExamples.creational.abstractFactory.carConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.Stuffing;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ElectronicStuffing implements Stuffing {
    public void stuff() {
        System.out.println("stuffing with electronics");
    }
}
