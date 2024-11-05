package org.springExamples.behavioral.visitor.ways;

import org.springExamples.behavioral.visitor.vehicles.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class Departure implements WayParts {

    @Override
    public void passTheWay(Vehicle vehicle) {
        vehicle.goToDestination(this);
    }
}
