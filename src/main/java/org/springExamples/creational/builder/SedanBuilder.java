package org.springExamples.creational.builder;

import org.springExamples.creational.builder.abstractCar.CarBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SedanBuilder implements CarBuilder {

    private final Sedan car;

    @Autowired
    public SedanBuilder(Sedan car) {
        this.car = car;
    }

    @Override
    public CarBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public CarBuilder setModel(String model) {
        car.setModel(model);
        return this;
    }

    @Override
    public CarBuilder setNumberOfSeats(int numberOfSeats) {
        car.setNumberOfSeats(numberOfSeats);
        return this;
    }

    @Override
    public CarBuilder setNumberOfDoors(int numberOfDoors) {
        car.setNumberOfDoors(numberOfDoors);
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
