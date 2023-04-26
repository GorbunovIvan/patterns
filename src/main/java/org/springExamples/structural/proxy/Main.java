package org.springExamples.structural.proxy;

import org.springExamples.structural.proxy.beans.Animal;
import org.springExamples.structural.proxy.beans.ProxyDog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

//        // Before
//        Animal dog = new Dog();
//        System.out.println("dog is created, now it will make sound");
//        dog.makeSound();

        // After
        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Animal dog = context.getBean(ProxyDog.class);
        System.out.println("dog is not created yet");
        dog.makeSound();

        context.close();

        // The point is to create a proxy of object which will encapsulate the object
        // that (the real object) will not be available to us (but not obligatorily).
        // So we can control the work of object: initialize it lazily, change the access to methods, etc.
    }
}
