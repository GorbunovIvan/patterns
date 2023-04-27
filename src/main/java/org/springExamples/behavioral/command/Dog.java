package org.springExamples.behavioral.command;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    public void makeSound() {
        System.out.println("dog is making sound");
    }
    public void run() {
        System.out.println("dog starts to run");
    }
    public void jump() {
        System.out.println("dog is jumping");
    }
}
