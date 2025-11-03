package org.springExamples.creational.prototype;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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

    public Bike copy() {
        var newBike = newBike();
        newBike.setHorsePower(this.horsePower);
        newBike.setYear(this.year);
        newBike.setWeight(this.weight);
        return newBike;
    }

    @Lookup
    public Bike newBike() {
        return null;
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
