package org.example.structural.proxy;

public class Main {
    public static void main(String[] args) {
//        // Before
//        Animal dog = new Dog();
//        System.out.println("dog is created, now it will make sound");
//        dog.makeSound();

        // After
        Animal dog = new ProxyDog();
        System.out.println("dog is not created yet");
        dog.makeSound();

        // The point is to create a proxy of object which will encapsulate the object
        // that (the real object) will not be available to us (but not obligatorily).
        // So we can control the work of object: initialize it lazily, change the access to methods, etc.
    }
}
