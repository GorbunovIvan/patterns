package org.springExamples.behavioral.mediator;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SimpleUser implements User {

    private String name;
    private final Chat chat;

    public SimpleUser(Chat chat) {
        this.chat = chat;
        chat.addUser(this);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getMessage(String message) {
        System.out.println(name + " received a message: '" + message + "'");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " sent a message: '" + message + "'");
        chat.sendMessage(message, this);
    }
}
