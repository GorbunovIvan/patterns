package org.springExamples.creational.abstractFactory.carConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.BodyMaker;
import org.springExamples.creational.abstractFactory.abstractConveyor.ConveyorFactory;
import org.springExamples.creational.abstractFactory.abstractConveyor.Stuffing;
import org.springExamples.creational.abstractFactory.abstractConveyor.WheelsAdder;

public class CarConveyorFactory implements ConveyorFactory {

    @Override
    public BodyMaker getBodyMaker() {
        return new CarBodyMaker();
    }

    @Override
    public WheelsAdder getWheelsAdder() {
        return new BigWheelsAdder();
    }

    @Override
    public Stuffing getStuffing() {
        return new ElectronicStuffing();
    }
}
