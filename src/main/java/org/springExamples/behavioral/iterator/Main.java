package org.springExamples.behavioral.iterator;

import org.springExamples.behavioral.iterator.beans.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        House house = context.getBean(House.class);

        System.out.println("-- Iterator -- ");
        Iterator<EntityOfHouse> iterator = house.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("\n-- Deep iterator -- ");
        iterator = house.deepIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        context.close();
    }
}
