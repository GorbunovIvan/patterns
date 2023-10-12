package org.springExamples.creational.abstractFactory.bicycleConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.BodyMaker;
import org.springExamples.creational.abstractFactory.abstractConveyor.ConveyorFactory;
import org.springExamples.creational.abstractFactory.abstractConveyor.Stuffing;
import org.springExamples.creational.abstractFactory.abstractConveyor.WheelsAdder;

public class BicycleConveyorFactory implements ConveyorFactory {

    @Override
    public BodyMaker getBodyMaker() {
        return new BicycleBodyMaker();
    }

    @Override
    public WheelsAdder getWheelsAdder() {
        return new BicycleSmallWheelsAdder();
    }

    @Override
    public Stuffing getStuffing() {
        return new StuffingWithMechanics();
    }
}
