package org.example.behavioral.state;

public class Main {

    public static void main(String[] args) {

        Program program = new Program();
        program.setNextActivity();

        while (program.getActivity() != null) {
            program.doCurrentAction();
            program.setNextActivity();
        }

        // An object can change its behavior depending on its state, which is taken out to another object.
        // Different states are different classes, so we can handle them as different objects.
    }
}
