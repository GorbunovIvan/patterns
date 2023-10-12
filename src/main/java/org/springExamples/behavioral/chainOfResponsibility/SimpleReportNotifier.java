package org.springExamples.behavioral.chainOfResponsibility;

public class SimpleReportNotifier extends Notifier {

    public SimpleReportNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("sending simple report");
    }
}
