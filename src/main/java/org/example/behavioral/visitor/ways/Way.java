package org.example.behavioral.visitor.ways;

import org.example.behavioral.visitor.vehicles.Vehicle;

public class Way implements WayParts {
    private final WayParts[] partsOfWay = new WayParts[] {
            new Departure(),
            new TraversingRoads(),
            new Finishing()
    };

    @Override
    public void passTheWay(Vehicle vehicle) {
        for (var part : partsOfWay)
            part.passTheWay(vehicle);
    }
}
