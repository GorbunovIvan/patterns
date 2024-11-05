package org.springExamples.creational.factoryMethod.telegram;

import org.springExamples.creational.factoryMethod.abstractMessenger.Messenger;
import org.springframework.stereotype.Component;

@Component
public class Telegram implements Messenger {

    @Override
    public void run() {
        System.out.println("telegram is running");
    }
}
