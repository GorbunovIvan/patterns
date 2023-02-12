package org.example.behavioral.visitor.ways;

import org.example.behavioral.visitor.vehicles.Vehicle;

public class Departure implements WayParts {
    @Override
    public void passTheWay(Vehicle vehicle) {
        vehicle.goToDestination(this);
    }
}
