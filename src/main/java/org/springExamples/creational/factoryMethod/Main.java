package org.springExamples.creational.factoryMethod;

import org.springExamples.creational.factoryMethod.abstractMessenger.Messenger;
import org.springExamples.creational.factoryMethod.telegram.Telegram;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Messenger messenger = context.getBean(Telegram.class);
        messenger.run();

        context.close();
    }
}
