package org.springExamples.creational.abstractFactory.bicycleConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.BodyMaker;
import org.springExamples.creational.abstractFactory.abstractConveyor.ConveyorFactory;
import org.springExamples.creational.abstractFactory.abstractConveyor.Stuffing;
import org.springExamples.creational.abstractFactory.abstractConveyor.WheelsAdder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BicycleConveyorFactory implements ConveyorFactory {

    private final BodyMaker bodyMaker;
    private final WheelsAdder wheelsAdder;
    private final Stuffing stuffing;

    @Autowired
    public BicycleConveyorFactory(BicycleBodyMaker bodyMaker, BicycleSmallWheelsAdder wheelsAdder, StuffingWithMechanics stuffing) {
        this.bodyMaker = bodyMaker;
        this.wheelsAdder = wheelsAdder;
        this.stuffing = stuffing;
    }

    @Override
    public BodyMaker getBodyMaker() {
        return bodyMaker;
    }

    @Override
    public WheelsAdder getWheelsAdder() {
        return wheelsAdder;
    }

    @Override
    public Stuffing getStuffing() {
        return stuffing;
    }
}
