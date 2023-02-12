package org.example.behavioral.mediator;

public class SimpleUser implements User {
    private final String name;
    private final Chat chat;

    public SimpleUser(String name, Chat chat) {
        this.name = name;
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
}
