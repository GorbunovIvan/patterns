package org.springExamples.creational.prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {

    @Bean("bikeFrame")
    protected Bike getBikeFrame() {
        return new Bike();
    }

    @Bean("bike")
    @Scope("prototype")
    public Bike getBike() {
        Bike bikeFrame = getBikeFrame();
        return new Bike(bikeFrame.getHorsePower(), bikeFrame.getWeight(), bikeFrame.getYear());
    }
}
