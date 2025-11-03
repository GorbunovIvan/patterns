package org.springExamples.creational.abstractFactory.bicycleConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.ConveyorFactory;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class BicycleConveyorFactory implements ConveyorFactory {

    @Override
    @Lookup("bicycleBodyMaker")
    public BicycleBodyMaker getBodyMaker() {
        return null;
    }

    @Override
    @Lookup("bicycleSmallWheelsAdder")
    public BicycleSmallWheelsAdder getWheelsAdder() {
        return null;
    }

    @Override
    @Lookup("stuffingWithMechanics")
    public StuffingWithMechanics getStuffing() {
        return null;
    }
}
