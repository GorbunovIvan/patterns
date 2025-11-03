package org.springExamples.creational.prototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Bike frame = context.getBean(Bike.class);
        frame.setHorsePower(50);
        frame.setWeight(80);

        Bike bike1 = frame.copy();
        bike1.setYear(2000);

        Bike bike2 = frame.copy();
        bike2.setYear(2002);

        System.out.println(bike1);
        System.out.println(bike2);

        System.out.println("Are bikes the same object?: " + (bike1 == bike2));

        context.close();
    }
}
