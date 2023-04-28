package org.springExamples.behavioral.state;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Program program = context.getBean(Program.class);
        program.setNextActivity();

        while (program.getActivity() != null) {
            program.doCurrentAction();
            program.setNextActivity();
        }

        context.close();

        // An object can change its behavior depending on its state, which is taken out to another object.
        // Different states are different classes, so we can handle them as different objects.
    }
}
