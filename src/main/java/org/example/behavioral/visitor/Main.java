package org.example.behavioral.visitor;

import org.example.behavioral.visitor.vehicles.Bike;
import org.example.behavioral.visitor.vehicles.Car;
import org.example.behavioral.visitor.vehicles.Truck;
import org.example.behavioral.visitor.vehicles.Vehicle;
import org.example.behavioral.visitor.ways.Way;

public class Main {

    public static void main(String[] args) {

        Way way = new Way();

        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle truck = new Truck();

        way.passTheWay(car);
        System.out.println("-----");

        way.passTheWay(bike);
        System.out.println("-----");

        way.passTheWay(truck);

        // Represents an operation to be performed on the elements of an object structure.
        // Visitor lets you define a new operation without changing the classes
        // of the elements on which it operates
    }
}
