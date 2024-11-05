package org.springExamples.structural.adapter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Animal dog = context.getBean(AdapterDogToAnimal.class);

        dog.eat();
        dog.makeSound();
        dog.run();
        dog.jump();

        context.close();

        // The methods of class Dog resemble those of the interface "Animal", but are not the same,
        // so we need an adapter that will match the methods we need
    }
}
