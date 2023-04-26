package org.springExamples.structural.composite;

import org.springExamples.structural.composite.beans.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // Tree-like structure - each parent object has a collection of smaller objects and so on.
        House house = context.getBean(House.class);

        house.buildHouse();

        context.close();
    }
}
