package org.springExamples.creational.abstractFactory.carConveyor;

import org.springExamples.creational.abstractFactory.abstractConveyor.ConveyorFactory;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class CarConveyorFactory implements ConveyorFactory {

    @Override
    @Lookup
    public CarBodyMaker getBodyMaker() {
        return null;  // Implementation will be provided by Spring
    }

    @Override
    @Lookup
    public BigWheelsAdder getWheelsAdder() {
        return null;
    }

    @Override
    @Lookup
    public ElectronicStuffing getStuffing() {
        return null;
    }
}
