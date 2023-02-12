package org.example.creational.builder;

import org.example.creational.builder.abstractCar.Car;

public class Main {
    public static void main(String[] args) {
//        // Before
//        Car car = new Car();
//
//        car.setColor("Black");
//        car.setModel("BMW");
//        car.setNumberOfSeats(5);
//        car.setNumberOfDoors(2); // actually wrong because 5 seats and only 2 doors is strange
//
//        // we are not sure if all the fields are filled
//        System.out.println(car);

        // After
        Car car = SedanBuilder.newCar()
                .setColor("Black")
                .setModel("BMW")
                .setNumberOfSeats(5)
                .setNumberOfDoors(3)
                .build();

        System.out.println(car);
    }
}
