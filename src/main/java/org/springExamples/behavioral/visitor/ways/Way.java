package org.springExamples.behavioral.visitor.ways;

import org.springExamples.behavioral.visitor.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Way implements WayParts {

    private final WayParts[] partsOfWay;

    public Way(@Qualifier("departure") WayParts departure,
               @Qualifier("traversingRoads") WayParts traversingRoads,
               @Qualifier("finishing") WayParts finishing) {
        partsOfWay = new WayParts[] {
                departure,
                traversingRoads,
                finishing
        };
    }

    @Override
    public void passTheWay(Vehicle vehicle) {
        for (var part : partsOfWay) {
            part.passTheWay(vehicle);
        }
    }
}
