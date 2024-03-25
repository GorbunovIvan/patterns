package org.springExamples.behavioral.command.commandsOfDog;

import org.springExamples.behavioral.command.Dog;
import org.springframework.stereotype.Component;

@Component
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