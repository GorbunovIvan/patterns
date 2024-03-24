package org.springExamples.behavioral.visitor.ways;

import org.springExamples.behavioral.visitor.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Way implements WayParts {

    private final WayParts[] partsOfWay;

    public Way(@Qualifier("partsOfWay") WayParts[] partsOfWay) {
        this.partsOfWay = partsOfWay;
    }

    @Override
    public void passTheWay(Vehicle vehicle) {
        for (var part : partsOfWay)
            part.passTheWay(vehicle);
    }
}
