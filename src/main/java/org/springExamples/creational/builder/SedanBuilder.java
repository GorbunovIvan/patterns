package org.springExamples.creational.builder;

import org.springExamples.creational.builder.abstractCar.CarBuilder;

public class SedanBuilder implements CarBuilder {

    private Sedan car;

    private SedanBuilder(){}

    public static CarBuilder newCar() {
        SedanBuilder builder = new SedanBuilder();
        builder.car = new Sedan();
        return builder;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.car.setColor(color);
        return this;
    }

    @Override
    public CarBuilder setModel(String model) {
        this.car.setModel(model);
        return this;
    }

    @Override
    public CarBuilder setNumberOfSeats(int numberOfSeats) {
        this.car.setNumberOfSeats(numberOfSeats);
        return this;
    }

    @Override
    public CarBuilder setNumberOfDoors(int numberOfDoors) {
        this.car.setNumberOfDoors(numberOfDoors);
        return this;
    }

    @Override
    public Sedan build() {
        if (car.getModel().isEmpty())
            throw new IllegalStateException("empty model");
        if (car.getNumberOfSeats() > car.getNumberOfDoors()*2
            || car.getNumberOfDoors() > car.getNumberOfSeats()*2)
            throw new IllegalStateException("number of seats is inconsistent with the number of doors");
        return car;
    }
}
