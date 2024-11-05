package org.springExamples.structural.proxy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Dog implements Animal {

    public Dog() {
        getUp();
    }

    private void getUp() {
        System.out.println("getting up");
    }

    @Override
    public void makeSound() {
        System.out.println("woof");
    }
}
