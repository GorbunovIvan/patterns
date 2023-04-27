package org.springExamples.behavioral.chainOfResponsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmailNotifier extends Notifier {

    @Autowired
    public EmailNotifier(@Qualifier("importantPriority") Priority priority) {
        super(priority);
    }

    @Override
    @Autowired
    public void setNextNotifier(@Qualifier("SMSNotifier") Notifier nextNotifier) {
        super.setNextNotifier(nextNotifier);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("sending email");
    }
}
