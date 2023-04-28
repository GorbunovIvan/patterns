package org.springExamples.behavioral.visitor.ways;

import org.springExamples.behavioral.visitor.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Way implements WayParts {

    private final WayParts[] partsOfWay;

    @Autowired
    public Way(WayParts[] partsOfWay) {
        this.partsOfWay = partsOfWay;
    }

    @Override
    public void passTheWay(Vehicle vehicle) {
        for (var part : partsOfWay)
            part.passTheWay(vehicle);
    }
}
