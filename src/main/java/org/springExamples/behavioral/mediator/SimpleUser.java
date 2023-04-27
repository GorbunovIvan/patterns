package org.springExamples.behavioral.mediator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SimpleUser implements User {

    private String name;
    private Chat chat;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public void setChat(Chat chat) {
        this.chat = chat;
        chat.addUser(this);
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

    @Override
    public String toString() {
        return "SimpleUser{" +
                "name='" + name + '\'' +
                '}';
    }
}
