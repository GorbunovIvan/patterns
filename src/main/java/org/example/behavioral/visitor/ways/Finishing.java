package org.example.behavioral.visitor.ways;

import org.example.behavioral.visitor.vehicles.Vehicle;

public class Finishing implements WayParts {
    @Override
    public void passTheWay(Vehicle vehicle) {
        vehicle.goToDestination(this);
    }
}
