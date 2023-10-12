package org.springExamples.behavioral.chainOfResponsibility;

public class SMSNotifier extends Notifier {

    public SMSNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("sending SMS");
    }
}
