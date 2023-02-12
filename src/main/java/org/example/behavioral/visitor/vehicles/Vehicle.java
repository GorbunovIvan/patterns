package org.example.behavioral.visitor.vehicles;

import org.example.behavioral.visitor.ways.Departure;
import org.example.behavioral.visitor.ways.Finishing;
import org.example.behavioral.visitor.ways.TraversingRoads;

public interface Vehicle {
    void goToDestination(Departure way);
    void goToDestination(TraversingRoads way);
    void goToDestination(Finishing way);
}
