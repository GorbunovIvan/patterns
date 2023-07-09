package org.example.creational.abstractFactory.carConveyor;

import org.example.creational.abstractFactory.abstractConveyor.BodyMaker;
import org.example.creational.abstractFactory.abstractConveyor.ConveyorFactory;
import org.example.creational.abstractFactory.abstractConveyor.Stuffing;
import org.example.creational.abstractFactory.abstractConveyor.WheelsAdder;

public class CarConveyorFactory implements ConveyorFactory {

    public BodyMaker getBodyMaker() {
        return new CarBodyMaker();
    }

    public WheelsAdder getWheelsAdder() {
        return new SmallWheelsAdder();
    }

    public Stuffing getStuffing() {
        return new ElectronicStuffing();
    }
}
