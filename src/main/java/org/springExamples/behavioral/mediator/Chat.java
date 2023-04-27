package org.springExamples.behavioral.mediator;

public interface Chat {
    void addUser(User user);
    void sendMessage(String message, User sender);
}
