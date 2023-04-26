package org.springExamples.structural.decorator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Before
//        Employee employee = context.getBean(SimpleWorker.class);
//        System.out.println(employee.doWork());

        // After
        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Employee employee = context.getBean(SeniorWorker.class);
        System.out.println(employee.doWork());

        context.close();

        // A decorator is just a "copy" of a class that we can't extend, so we encapsulate it (via composition)
        // and then we can easily extend that decorator class and add our functionality
    }
}
