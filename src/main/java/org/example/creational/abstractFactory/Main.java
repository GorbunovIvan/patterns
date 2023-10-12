package org.example.creational.abstractFactory;

import org.example.creational.abstractFactory.abstractConveyor.BodyMaker;
import org.example.creational.abstractFactory.abstractConveyor.ConveyorFactory;
import org.example.creational.abstractFactory.abstractConveyor.Stuffing;
import org.example.creational.abstractFactory.abstractConveyor.WheelsAdder;
import org.example.creational.abstractFactory.carConveyor.CarConveyorFactory;

public class Main {

    public static void main(String[] args) {

//        // Before
//        CarBodyMaker carBodyMaker = new CarBodyMaker();
//        SmallWheelsAdder smallWheelsAdder = new SmallWheelsAdder();
//        ElectronicStuffing electronicStuffing = new ElectronicStuffing();
//
//        carBodyMaker.makeBody();
//        smallWheelsAdder.addWheels();
//        electronicStuffing.stuff();

        // After
        ConveyorFactory conveyorFactory = new CarConveyorFactory();
//        ConveyorFactory conveyorFactory = new BicycleConveyorFactory();
        BodyMaker bodyMaker = conveyorFactory.getBodyMaker();
        WheelsAdder wheelsAdder = conveyorFactory.getWheelsAdder();
        Stuffing stuffing = conveyorFactory.getStuffing();

        bodyMaker.makeBody();
        wheelsAdder.addWheels();
        stuffing.stuff();
    }
}
