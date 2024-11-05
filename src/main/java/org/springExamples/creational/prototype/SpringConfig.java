package org.springExamples.creational.prototype;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {

    @Bean
    public Bike bikeFrame() {
        var frame = new Bike();
        frame.setHorsePower(50);
        frame.setWeight(80);
        return frame;
    }

    @Bean
    public BikeFactory bikeFactory(Bike bikeFrame) {
        return new BikeFactory(bikeFrame);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Bike bike(BikeFactory bikeFactory) {
        var newEmptyBike = new Bike();
        return bikeFactory.setFrameTo(newEmptyBike);
    }

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Bike bike1 = context.getBean("bike", Bike.class);
        bike1.setYear(2000);

        Bike bike2 = context.getBean("bike", Bike.class);
        bike2.setYear(2002);

        System.out.println(bike1);
        System.out.println(bike2);

        context.close();
    }
}
