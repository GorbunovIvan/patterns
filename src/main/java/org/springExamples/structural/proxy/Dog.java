package org.springExamples.structural.proxy;

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
