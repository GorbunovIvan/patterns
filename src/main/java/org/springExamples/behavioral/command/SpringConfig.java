package org.springExamples.behavioral.command;

import org.springExamples.behavioral.command.commandsOfDog.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Command makingSound = context.getBean(MakingSound.class);
        Command running = context.getBean(Running.class);
        Command jumping = context.getBean(Jumping.class);
        Command eating = context.getBean(Eating.class); // does not exist as a method in Dog-class

        orderTheDogToFollowACommand(running);
        orderTheDogToFollowACommand(eating);

        System.out.println(Command.getExecutedCommands());

        context.close();

        // Now the "orderTheDogToFollowACommand()" method may not know what command it accepts,
        // because each command is no longer a method, but a different class.
        // So the point is to create the different classes for the algorithms.
    }

    static void orderTheDogToFollowACommand(Command command) {
        command.execute();
    }
}