package org.springExamples.creational.prototype;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bike")
@Scope("prototype")
public class Bike implements ApplicationContextAware {

    private int horsePower;
    private int weight;
    private int year;

    private ApplicationContext context;

    public Bike() {
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
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
        Bike copy = context.getBean("bike", Bike.class);
        copy.setWeight(this.getHorsePower());
        copy.setWeight(this.getWeight());
        copy.setWeight(this.getYear());
        return copy;
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
