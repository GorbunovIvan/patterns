package org.example.creational.builder.abstractCar;

public interface CarBuilder {

    CarBuilder setColor(String color);

    CarBuilder setModel(String model);

    CarBuilder setNumberOfSeats(int numberOfSeats);

    CarBuilder setNumberOfDoors(int numberOfDoors);

    Car build();
}
