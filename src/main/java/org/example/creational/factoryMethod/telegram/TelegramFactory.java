package org.example.creational.factoryMethod.telegram;

import org.example.creational.factoryMethod.abstractMessenger.Messenger;
import org.example.creational.factoryMethod.abstractMessenger.MessengerFactory;

public class TelegramFactory implements MessengerFactory {
    @Override
    public Messenger createMessenger() {
        return new Telegram();
    }
}
