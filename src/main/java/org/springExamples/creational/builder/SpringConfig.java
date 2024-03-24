package org.springExamples.creational.builder;

import org.springExamples.creational.builder.abstractCar.Car;
import org.springExamples.creational.builder.abstractCar.CarBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    public CarBuilder sedanBuilder() {
        return new SedanBuilder(new Sedan());
    }

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
