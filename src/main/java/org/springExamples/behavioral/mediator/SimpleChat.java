package org.springExamples.behavioral.mediator;

import java.util.HashSet;
import java.util.Set;

public class SimpleChat implements Chat {

    private final Set<User> users = new HashSet<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (var user : users) {
            if (user != sender) {
                user.getMessage(message);
            }
        }
    }
}
