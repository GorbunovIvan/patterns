package org.example.behavioral.command.commandsOfDog;

import org.example.behavioral.command.Dog;

public class Jumping extends Command {

    public Jumping(Dog dog) {
        super(dog);
    }

    @Override
    public void executeCommand() {
        dog.jump();
    }

    @Override
    public String toString() {
        return "Jumping";
    }
}
