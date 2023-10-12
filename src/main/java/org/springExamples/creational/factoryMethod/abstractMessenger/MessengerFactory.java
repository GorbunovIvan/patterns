package org.springExamples.creational.factoryMethod.abstractMessenger;

import org.springExamples.creational.factoryMethod.telegram.TelegramFactory;
import org.springExamples.creational.factoryMethod.viber.ViberFactory;

public interface MessengerFactory {

    Messenger createMessenger();

    static MessengerFactory createMessengerFactoryByMessengerName(String name) {
        if (name.equalsIgnoreCase("viber"))
            return new ViberFactory();
        else if (name.equalsIgnoreCase("telegram"))
            return new TelegramFactory();
        throw new IllegalArgumentException("unknown messenger: " + name);
    }
}
