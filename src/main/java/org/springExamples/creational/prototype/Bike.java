package org.springExamples.creational.prototype;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Primary
public class Bike implements ApplicationContextAware {

    private int horsePower;
    private int weight;
    private int year;

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
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
        var newBike = applicationContext.getBean(Bike.class);
        newBike.setHorsePower(getHorsePower());
        newBike.setWeight(getWeight());
        newBike.setYear(getYear());
        return newBike;
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
