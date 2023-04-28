package org.springExamples.behavioral.visitor.vehicles;

import org.springExamples.behavioral.visitor.ways.Departure;
import org.springExamples.behavioral.visitor.ways.Finishing;
import org.springExamples.behavioral.visitor.ways.TraversingRoads;

public interface Vehicle {
    void goToDestination(Departure way);
    void goToDestination(TraversingRoads way);
    void goToDestination(Finishing way);
}
