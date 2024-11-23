package org.example.behavioral.command;

import org.example.behavioral.command.commandsOfDog.*;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Command makingSound = new MakingSound(dog);
        Command running = new Running(dog);
        Command jumping = new Jumping(dog);
        Command eating = new Eating(dog); // does not exist as a method in Dog-class

        orderTheDogToFollowACommand(running);
        orderTheDogToFollowACommand(eating);

        System.out.println(Command.getExecutedCommands());

        // Now the "orderTheDogToFollowACommand()" method may not know what command it accepts,
        // because each command is no longer a method, but a different class.
        // So the point is to create the different classes for the algorithms.
        //
        // Functional programming has made the pattern command pretty outdated.
    }

    static void orderTheDogToFollowACommand(Command command) {
        command.execute();
    }
}