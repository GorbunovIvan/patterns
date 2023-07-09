package org.example.behavioral.command.commandsOfDog;

import org.example.behavioral.command.Dog;

public class Eating extends Command {

    public Eating(Dog dog) {
        super(dog);
    }

    @Override
    public void executeCommand() {
        System.out.println("dog starts to eat");
    }

    @Override
    public String toString() {
        return "Eating";
    }
}
