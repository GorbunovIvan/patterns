package org.springExamples.behavioral.mediator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        User admin = context.getBean(SimpleUser.class);
        admin.setName("Admin");

        User user1 = context.getBean(SimpleUser.class);
        user1.setName("User-1");

        User user2 = context.getBean(SimpleUser.class);
        user2.setName("User-2");

        admin.sendMessage("Everything is fixed");
        user1.sendMessage("Great!");

        context.close();

        // The chat (mediator here) is a class that encapsulates the relations and communication between other classes.
        // Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it
        // lets you vary their interaction independently
    }
}
