package org.springExamples.creational.factoryMethod.viber;

import org.springExamples.creational.factoryMethod.abstractMessenger.Messenger;
import org.springframework.stereotype.Component;

@Component
public class Viber implements Messenger {
    public void run() {
        System.out.println("viber is running");
    }
}
