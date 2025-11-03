package org.springExamples.behavioral.mediator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    User admin(@Value("Admin") String name, Chat chat) {
        return new SimpleUser(name, chat);
    }

    @Bean
    User user1(@Value("User-1") String name, Chat chat) {
        return new SimpleUser(name, chat);
    }

    @Bean
    User user2(@Value("User-2") String name, Chat chat) {
        return new SimpleUser(name, chat);
    }

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        User admin = context.getBean("admin", User.class);
        User user1 = context.getBean("user1", User.class);

        admin.sendMessage("Everything is fixed");
        user1.sendMessage("Great!");

        context.close();

        // The chat (mediator here) is a class that encapsulates the relations and communication between other classes.
        // Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it
        // lets you vary their interaction independently.
        //
        // Here Users instead of depending on each other (or knowing about each other) depend on the Chat (Mediator)
    }
}
