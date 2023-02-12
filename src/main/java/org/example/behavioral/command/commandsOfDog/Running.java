package org.example.behavioral.command.commandsOfDog;

import org.example.behavioral.command.Dog;

public class Running extends Command {
    public Running(Dog dog) {
        super(dog);
    }

    @Override
    public void executeCommand() {
        dog.run();
    }

    @Override
    public String toString() {
        return "Running";
    }
}
