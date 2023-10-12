package org.springExamples.creational.factoryMethod;

import org.springExamples.creational.factoryMethod.abstractMessenger.Messenger;
import org.springExamples.creational.factoryMethod.abstractMessenger.MessengerFactory;

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
