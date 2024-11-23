package org.springExamples.structural.proxy;

public class Dog implements Animal {

    public Dog() {
        System.out.println("Dog created");
    }

    @Override
    public void makeSound() {
        System.out.println("woof");
    }
}
