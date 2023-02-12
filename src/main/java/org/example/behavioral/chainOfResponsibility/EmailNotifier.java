package org.example.behavioral.chainOfResponsibility;

public class EmailNotifier extends Notifier {

    public EmailNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("sending email");
    }
}
