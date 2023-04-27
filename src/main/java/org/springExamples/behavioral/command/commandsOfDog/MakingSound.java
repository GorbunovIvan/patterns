package org.springExamples.behavioral.command.commandsOfDog;

import org.springExamples.behavioral.command.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MakingSound extends Command {

    @Autowired
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
