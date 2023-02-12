package org.example.behavioral.command.commandsOfDog;

import org.example.behavioral.command.Dog;

public class MakingSound extends Command {
    public MakingSound(Dog dog) {
        super(dog);
    }

    @Override
    public void executeCommand() {
        dog.makeSound();
    }

    @Override
    public String toString() {
        return "MakingSound";
    }
}
