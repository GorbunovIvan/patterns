package org.springExamples.creational.prototype;

public class Bike {

    private int horsePower;
    private int weight;
    private int year;

    public Bike() {
    }

    public Bike(int horsePower, int weight, int year) {
        this.horsePower = horsePower;
        this.weight = weight;
        this.year = year;
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

    @Override
    public String toString() {
        return "Bike{" +
                "horsePower=" + horsePower +
                ", weight=" + weight +
                ", year=" + year +
                '}';
    }
}
