package org.springExamples.creational.builder.abstractCar;

public interface Car {
    String getColor();

    void setColor(String color);

    String getModel();

    void setModel(String model);

    int getNumberOfSeats();

    void setNumberOfSeats(int numberOfSeats);

    int getNumberOfDoors();

    void setNumberOfDoors(int numberOfDoors);
}
