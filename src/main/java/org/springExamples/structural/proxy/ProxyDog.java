package org.springExamples.structural.proxy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ProxyDog implements Animal {

    private final Animal dog;

    // @Lazy tells Spring to inject only a proxy. This will not trigger bean "dog" to be initialized
    public ProxyDog(@Lazy Animal dog) {
        this.dog = dog;
    }

    @Override
    public void makeSound() {
        dog.makeSound();  // Triggering bean "dog" to be initialized (if it's not yet in the container)
    }
}
