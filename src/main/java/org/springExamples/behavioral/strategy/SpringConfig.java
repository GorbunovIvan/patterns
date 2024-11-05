package org.springExamples.behavioral.strategy;

import org.springExamples.behavioral.strategy.states.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Program program = context.getBean(Program.class);

        var initializing = context.getBean(Initializing.class);
        program.setActivity(initializing);
        program.doCurrentAction();

        var connectingToInternet = context.getBean(ConnectingToInternet.class);
        program.setActivity(connectingToInternet);
        program.doCurrentAction();

        var parsingData = context.getBean(ParsingData.class);
        program.setActivity(parsingData);
        program.doCurrentAction();

        var savingData = context.getBean(SavingData.class);
        program.setActivity(savingData);
        program.doCurrentAction();

        var shuttingDown = context.getBean(ShuttingDown.class);
        program.setActivity(shuttingDown);
        program.doCurrentAction();

        context.close();

        // Define a family of algorithms, encapsulate each one, and make them interchangeable.
        // Strategy lets the algorithm vary independently from clients that use it.
        // So different clients may choose different ways and orders in using algorithms.
        // It may look very similar to the state pattern, but instead of state,
        // strategy does not define change order of algorithms and does not impose an obligation on clients
        // in using them.
    }
}
