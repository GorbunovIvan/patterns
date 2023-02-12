package org.example.creational.builder;

import org.example.creational.builder.abstractCar.CarBuilder;

public class SedanBuilder implements CarBuilder {
    private Sedan car;

    private SedanBuilder(){}

    public static CarBuilder newCar() {
        SedanBuilder builder = new SedanBuilder();
        builder.car = new Sedan();
        return builder;
    }

    public CarBuilder setColor(String color) {
        this.car.setColor(color);
        return this;
    }

    public CarBuilder setModel(String model) {
        this.car.setModel(model);
        return this;
    }

    public CarBuilder setNumberOfSeats(int numberOfSeats) {
        this.car.setNumberOfSeats(numberOfSeats);
        return this;
    }

    public CarBuilder setNumberOfDoors(int numberOfDoors) {
        this.car.setNumberOfDoors(numberOfDoors);
        return this;
    }

    public Sedan build() {
        if (car.getModel().isEmpty())
            throw new IllegalStateException("empty model");
        if (car.getNumberOfSeats() > car.getNumberOfDoors()*2
            || car.getNumberOfDoors() > car.getNumberOfSeats()*2)
            throw new IllegalStateException("number of seats is inconsistent with the number of doors");
        return car;
    }
}
