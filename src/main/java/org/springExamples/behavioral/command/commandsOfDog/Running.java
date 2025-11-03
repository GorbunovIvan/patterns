package org.springExamples.behavioral.command.commandsOfDog;

import org.springExamples.behavioral.command.Dog;
import org.springframework.stereotype.Component;

@Component
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