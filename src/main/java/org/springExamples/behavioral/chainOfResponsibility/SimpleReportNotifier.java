package org.springExamples.behavioral.chainOfResponsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SimpleReportNotifier extends Notifier {

    @Autowired
    public SimpleReportNotifier(@Qualifier("simplePriority")  Priority priority) {
        super(priority);
    }

    @Override
    @Autowired
    public void setNextNotifier(@Qualifier("emailNotifier") Notifier nextNotifier) {
        super.setNextNotifier(nextNotifier);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("sending simple report");
    }
}
