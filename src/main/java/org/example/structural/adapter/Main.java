package org.example.structural.adapter;

public class Main {
    public static void main(String[] args) {
        // the methods of class Dog resemble the interface "Animal" methods but are not the same,
        // so we need adapter which will match the needed methods

//        Animal dog = new Dog();
        Animal dog = new AdapterDogToAnimal();
        dog.eat();
        dog.makeSound();
        dog.run();
        dog.jump();
    }
}
