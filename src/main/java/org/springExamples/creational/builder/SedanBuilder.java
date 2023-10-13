package org.springExamples.creational.builder;

import org.springExamples.creational.builder.abstractCar.CarBuilder;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SedanBuilder implements CarBuilder, ApplicationContextAware {

    private Sedan car;
    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public CarBuilder newCar() {
        this.car = context.getBean(Sedan.class);
        return this;
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
