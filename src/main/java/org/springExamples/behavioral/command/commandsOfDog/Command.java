package org.springExamples.behavioral.command.commandsOfDog;

import org.springExamples.behavioral.command.Dog;

import java.util.ArrayList;
import java.util.List;

public abstract class Command {

    protected final Dog dog;
    private static final List<Command> EXECUTED_COMMANDS = new ArrayList<>();

    public Command(Dog dog) {
        this.dog = dog;
    }

    public void execute() {
        executeCommand();
        saveTheExecution(this);
    }

    public abstract void executeCommand();

    protected void saveTheExecution(Command command) {
        EXECUTED_COMMANDS.add(command);
    }

    public static List<Command> getExecutedCommands() {
        return new ArrayList<>(EXECUTED_COMMANDS);
    }
}