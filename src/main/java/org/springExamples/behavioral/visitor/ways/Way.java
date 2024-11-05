package org.springExamples.behavioral.visitor.ways;

import org.springExamples.behavioral.visitor.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Way implements WayParts {

    private final List<WayParts> partsOfWay;

    public Way(@Qualifier("partsOfWay") List<WayParts> partsOfWay) {
        this.partsOfWay = partsOfWay;
    }

    @Override
    public void passTheWay(Vehicle vehicle) {
        for (var part : partsOfWay) {
            part.passTheWay(vehicle);
        }
    }
}
