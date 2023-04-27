package org.springExamples.behavioral.command.commandsOfDog;

import org.springExamples.behavioral.command.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Jumping extends Command {

    @Autowired
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
