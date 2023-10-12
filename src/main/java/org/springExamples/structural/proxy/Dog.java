package org.springExamples.structural.proxy;

public class Dog implements Animal {

    public Dog() {
        getUp();
    }

    public void getUp() {
        System.out.println("getting up");
    }

    @Override
    public void makeSound() {
        System.out.println("woof");
    }
}
