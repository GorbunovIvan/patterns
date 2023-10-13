package org.springExamples.structural.proxy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    public static void main(String[] args) {

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
