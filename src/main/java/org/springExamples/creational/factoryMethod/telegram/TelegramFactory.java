package org.springExamples.creational.factoryMethod.telegram;

import org.springExamples.creational.factoryMethod.abstractMessenger.Messenger;
import org.springExamples.creational.factoryMethod.abstractMessenger.MessengerFactory;

public class TelegramFactory implements MessengerFactory {
    @Override
    public Messenger createMessenger() {
        return new Telegram();
    }
}
