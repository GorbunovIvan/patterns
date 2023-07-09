package org.example.behavioral.visitor.vehicles;

import org.example.behavioral.visitor.ways.Departure;
import org.example.behavioral.visitor.ways.Finishing;
import org.example.behavioral.visitor.ways.TraversingRoads;

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
