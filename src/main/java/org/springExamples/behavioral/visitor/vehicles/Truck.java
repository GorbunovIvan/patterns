package org.springExamples.behavioral.visitor.vehicles;

import org.springExamples.behavioral.visitor.ways.Departure;
import org.springExamples.behavioral.visitor.ways.Finishing;
import org.springExamples.behavioral.visitor.ways.TraversingRoads;
import org.springframework.stereotype.Component;

@Component
public class Truck implements Vehicle {

    @Override
    public void goToDestination(Departure way) {
        System.out.println("truck starts to move");
    }

    @Override
    public void goToDestination(TraversingRoads way) {
        System.out.println("truck traverses the roads");
    }

    @Override
    public void goToDestination(Finishing way) {
        System.out.println("truck finishes");
    }
}
