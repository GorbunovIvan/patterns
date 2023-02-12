package org.example.creational.factoryMethod.viber;

import org.example.creational.factoryMethod.abstractMessenger.Messenger;

public class Viber implements Messenger {
    public void run() {
        System.out.println("viber is running");
    }
}
