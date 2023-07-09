package org.example.creational.factoryMethod;

import org.example.creational.factoryMethod.abstractMessenger.Messenger;
import org.example.creational.factoryMethod.abstractMessenger.MessengerFactory;

public class Main {

    public static void main(String[] args) {

//        // Before
//        Viber viber = new Viber();
//        viber.run();

        // After
        MessengerFactory factory = MessengerFactory.createMessengerFactoryByMessengerName("telegram");
        Messenger messenger = factory.createMessenger();
        messenger.run();
    }
}
