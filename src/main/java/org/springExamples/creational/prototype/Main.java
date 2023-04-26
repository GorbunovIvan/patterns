package org.springExamples.creational.prototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Bike frame = context.getBean("bikeFrame", Bike.class);
        frame.setHorsePower(50);
        frame.setWeight(80);

        Bike bike1 = context.getBean("bike", Bike.class);
        bike1.setYear(2000);

        Bike bike2 = context.getBean("bike", Bike.class);
        bike2.setYear(2002);

        System.out.println(bike1);
        System.out.println(bike2);

        context.close();
    }
}
