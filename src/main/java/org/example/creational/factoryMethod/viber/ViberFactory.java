package org.example.creational.factoryMethod.viber;

import org.example.creational.factoryMethod.abstractMessenger.Messenger;
import org.example.creational.factoryMethod.abstractMessenger.MessengerFactory;

public class ViberFactory implements MessengerFactory {

    @Override
    public Messenger createMessenger() {
        return new Viber();
    }
}
