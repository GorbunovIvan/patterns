package org.springExamples.behavioral.strategy;

import org.springExamples.behavioral.strategy.states.*;

public class Main {

    public static void main(String[] args) {

        Program program = new Program();

        program.setActivity(new Initializing());
        program.doCurrentAction();

        program.setActivity(new ConnectingToInternet());
        program.doCurrentAction();

        program.setActivity(new ParsingData());
        program.doCurrentAction();

        program.setActivity(new SavingData());
        program.doCurrentAction();

        program.setActivity(new ShuttingDown());
        program.doCurrentAction();

        // Define a family of algorithms, encapsulate each one, and make them interchangeable.
        // Strategy lets the algorithm vary independently from clients that use it.
        // So different clients may choose different ways and orders in using algorithms.
        // It may look very similar to the state pattern, but instead of state,
        // strategy does not define change order of algorithms and does not impose an obligation on clients
        // in using them.
    }
}
