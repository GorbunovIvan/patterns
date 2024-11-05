package org.springExamples.creational.builder;

import org.springExamples.creational.builder.abstractCar.Car;
import org.springExamples.creational.builder.abstractCar.CarBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        var carBuilder = context.getBean("sedanBuilder", CarBuilder.class);

        Car car = carBuilder
                .setColor("Black")
                .setModel("BMW")
                .setNumberOfSeats(5)
                .setNumberOfDoors(3)
                .build();

        System.out.println(car);

        context.close();
    }
}
