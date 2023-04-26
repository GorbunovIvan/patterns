package org.springExamples.structural.adapter;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    public void eatFood() {
        System.out.println("eating food");
    }
    public void bark() {
        System.out.println("barking");
    }
    public void runAway() {
        System.out.println("running away");
    }
    public void leap() {
        System.out.println("leaping high");
    }
}
