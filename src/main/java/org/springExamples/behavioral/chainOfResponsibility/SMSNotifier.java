package org.springExamples.behavioral.chainOfResponsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SMSNotifier extends Notifier {

    @Autowired
    public SMSNotifier(@Qualifier("asapPriority") Priority priority) {
        super(priority);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("sending SMS");
    }
}
