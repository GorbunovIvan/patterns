package org.springExamples.behavioral.mediator;

public class Main {

    public static void main(String[] args) {

        Chat chat = new SimpleChat();

        User admin = new SimpleUser("Admin", chat);
        User user1 = new SimpleUser("User-1", chat);
        User user2 = new SimpleUser("User-2", chat);

        admin.sendMessage("Everything is fixed");
        user1.sendMessage("Great!");

        // The chat (mediator here) is a class that encapsulates the relations and communication between other classes.
        // Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it
        // lets you vary their interaction independently.
        //
        // Here Users instead of depending on each other (or knowing about each other) depend on the Chat (Mediator)
    }
}
