package org.springExamples.creational.abstractFactory.abstractConveyor;

public interface ConveyorFactory {
    BodyMaker getBodyMaker();
    WheelsAdder getWheelsAdder();
    Stuffing getStuffing();
}
