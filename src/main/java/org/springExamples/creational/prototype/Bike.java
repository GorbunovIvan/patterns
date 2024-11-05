package org.springExamples.creational.prototype;

public class Bike {

    private int horsePower;
    private int weight;
    private int year;

    public Bike() {
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Bike copyTo(Bike newEmptyBike) {
        newEmptyBike.setHorsePower(getHorsePower());
        newEmptyBike.setWeight(getWeight());
        newEmptyBike.setYear(getYear());
        return newEmptyBike;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "horsePower=" + horsePower +
                ", weight=" + weight +
                ", year=" + year +
                '}';
    }
}
