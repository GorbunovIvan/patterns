package org.springExamples.creational.factoryMethod;

import org.springExamples.creational.factoryMethod.abstractMessenger.Messenger;
import org.springExamples.creational.factoryMethod.telegram.Telegram;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Messenger messenger = context.getBean(Telegram.class);
        messenger.run();

        context.close();
    }
}
