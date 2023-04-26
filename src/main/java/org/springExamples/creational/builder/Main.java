package org.springExamples.creational.builder;

import org.springExamples.creational.builder.abstractCar.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Car car = context.getBean(SedanBuilder.class)
                .setColor("Black")
                .setModel("BMW")
                .setNumberOfSeats(5)
                .setNumberOfDoors(3)
                .build();

        System.out.println(car);

        context.close();
    }
}
