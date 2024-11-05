package org.springExamples.structural.proxy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ProxyDog implements Animal {

    private final Animal dog;

    public ProxyDog(@Lazy Animal dog) {
        this.dog = dog;
    }

    @Override
    public void makeSound() {
        dog.makeSound();
    }
}
