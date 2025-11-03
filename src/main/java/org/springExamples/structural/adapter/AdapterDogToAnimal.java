package org.springExamples.structural.adapter;

import org.springframework.stereotype.Component;

@Component
public class AdapterDogToAnimal extends Dog implements Animal {

    @Override
    public void eat() {
        eatFood();
    }

    @Override
    public void makeSound() {
        bark();
    }

    @Override
    public void run() {
        runAway();
    }

    @Override
    public void jump() {
        leap();
    }
}
