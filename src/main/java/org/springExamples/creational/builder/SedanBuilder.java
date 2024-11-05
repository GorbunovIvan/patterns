package org.springExamples.creational.builder;

import org.springExamples.creational.builder.abstractCar.Car;
import org.springExamples.creational.builder.abstractCar.CarBuilder;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SedanBuilder implements CarBuilder {

    private final Car car;

    private SedanBuilder(Car sedan) {
        this.car = sedan;
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
    public Car build() {
        if (car.getModel().isEmpty()) {
            throw new IllegalStateException("Empty model");
        }
        if (car.getNumberOfSeats() > car.getNumberOfDoors()*2
                || car.getNumberOfDoors() > car.getNumberOfSeats()*2) {
            throw new IllegalStateException("Number of seats is inconsistent with the number of doors");
        }
        return car;
    }
}
