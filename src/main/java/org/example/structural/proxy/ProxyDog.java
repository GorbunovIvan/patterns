package org.example.structural.proxy;

public class ProxyDog implements Animal {
    Animal dog;

    @Override
    public void makeSound() {
        if (dog == null)
            dog = new Dog();
        dog.makeSound();
    }
}
