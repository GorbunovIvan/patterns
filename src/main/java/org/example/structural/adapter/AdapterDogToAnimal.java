package org.example.structural.adapter;

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
