package org.springExamples.creational.builder;

import org.springExamples.creational.builder.abstractCar.Car;

public class Main {

    public static void main(String[] args) {

//        // Before
//        Car car = new Car();
//
//        car.setColor("Black");
//        car.setModel("BMW");
//        car.setNumberOfSeats(5);
//        car.setNumberOfDoors(2);  // Actually wrong, because 5 seats and only 2 doors is strange
//
//        // We are not sure that all fields are filled in
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
