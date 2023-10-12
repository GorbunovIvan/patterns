package org.springExamples.creational.prototype;

public class Main {

    public static void main(String[] args) {

//        // Before
//        Bike bike1 = new Bike();
//        bike1.setHorsePower(50);
//        bike1.setWeight(80);
//        bike1.setYear(2000);
//
//        Bike bike2 = new Bike();
//        bike2.setHorsePower(50);
//        bike2.setWeight(80);
//        bike2.setYear(2002);

        // After
        Bike frame = new Bike();
        frame.setHorsePower(50);
        frame.setWeight(80);

        BikeFactory bikeFactory = new BikeFactory(frame);

        Bike bike1 = bikeFactory.getNewCopy();
        bike1.setYear(2000);

        Bike bike2 = bikeFactory.getNewCopy();
        bike2.setYear(2002);

        System.out.println(bike1);
        System.out.println(bike2);
    }
}
