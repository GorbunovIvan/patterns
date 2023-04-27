package org.springExamples.behavioral.mediator;

public interface User {
    default void setName(String name) {}
    void getMessage(String message);
    void sendMessage(String message);
}
