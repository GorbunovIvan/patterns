package org.springExamples.structural.adapter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

//        Animal dog = context.getBean(Dog.class);
        Animal dog = context.getBean(AdapterDogToAnimal.class);
        dog.eat();
        dog.makeSound();
        dog.run();
        dog.jump();

        context.close();

        // the methods of class Dog resemble the interface "Animal" methods but are not the same,
        // so we need adapter which will match the needed methods
    }
}
