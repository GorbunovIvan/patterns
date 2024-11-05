package org.springExamples.creational.abstractFactory.carConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.BodyMaker;
import org.springExamples.creational.abstractFactory.abstractConveyor.ConveyorFactory;
import org.springExamples.creational.abstractFactory.abstractConveyor.Stuffing;
import org.springExamples.creational.abstractFactory.abstractConveyor.WheelsAdder;
import org.springframework.stereotype.Component;

@Component
public class CarConveyorFactory implements ConveyorFactory {

    private final BodyMaker bodyMaker;
    private final WheelsAdder wheelsAdder;
    private final Stuffing stuffing;

    public CarConveyorFactory(CarBodyMaker bodyMaker,
                              SmallWheelsAdder wheelsAdder,
                              ElectronicStuffing stuffing) {
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
