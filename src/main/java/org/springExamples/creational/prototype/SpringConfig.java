package org.springExamples.creational.prototype;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    public Bike bikeFrame(Bike bike) {
        bike.setHorsePower(50);
        bike.setWeight(80);
        return bike;
    }

    @Bean
    public BikeFactory bikeFactory(@Qualifier("bikeFrame") Bike bikeFrame) {
        return new BikeFactory(bikeFrame);
    }

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        var bikeFactory = context.getBean(BikeFactory.class);

        Bike bike1 = bikeFactory.getNewCopy();
        bike1.setYear(2000);

        Bike bike2 = bikeFactory.getNewCopy();
        bike2.setYear(2002);

        System.out.println(bike1);
        System.out.println(bike2);

        context.close();
    }
}
