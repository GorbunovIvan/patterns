package org.springExamples.creational.factoryMethod.viber;

import org.springExamples.creational.factoryMethod.abstractMessenger.Messenger;
import org.springExamples.creational.factoryMethod.abstractMessenger.MessengerFactory;

public class ViberFactory implements MessengerFactory {

    @Override
    public Messenger createMessenger() {
        return new Viber();
    }
}
