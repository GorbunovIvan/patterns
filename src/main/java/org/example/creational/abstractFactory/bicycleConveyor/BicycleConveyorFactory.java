package org.example.creational.abstractFactory.bicycleConveyor;

import org.example.creational.abstractFactory.abstractConveyor.BodyMaker;
import org.example.creational.abstractFactory.abstractConveyor.ConveyorFactory;
import org.example.creational.abstractFactory.abstractConveyor.Stuffing;
import org.example.creational.abstractFactory.abstractConveyor.WheelsAdder;

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
