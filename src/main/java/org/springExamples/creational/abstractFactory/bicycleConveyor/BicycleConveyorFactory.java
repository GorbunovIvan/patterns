package org.springExamples.creational.abstractFactory.bicycleConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.BodyMaker;
import org.springExamples.creational.abstractFactory.abstractConveyor.ConveyorFactory;
import org.springExamples.creational.abstractFactory.abstractConveyor.Stuffing;
import org.springExamples.creational.abstractFactory.abstractConveyor.WheelsAdder;
import org.springframework.stereotype.Component;

@Component
public class BicycleConveyorFactory implements ConveyorFactory {

    private final BicycleBodyMaker bodyMaker;
    private final BicycleSmallWheelsAdder wheelsAdder;
    private final StuffingWithMechanics stuffing;

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
