package org.springExamples.structural.adapter;

public class Main {

    public static void main(String[] args) {

//        Animal dog = new Dog();
        Animal dog = new AdapterDogToAnimal();

        dog.eat();
        dog.makeSound();
        dog.run();
        dog.jump();

        // The methods of class Dog resemble those of the interface "Animal", but are not the same,
        // so we need an adapter that will match the methods we need
    }
}
