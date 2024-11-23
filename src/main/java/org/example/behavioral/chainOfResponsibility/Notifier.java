package org.example.behavioral.chainOfResponsibility;

public abstract class Notifier {

    private final Priority priority;
    private Notifier nextNotifier;

    public Notifier(Priority priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void sendMessage(String message, Priority priority) {
        if (this.priority.getIndex() > priority.getIndex()) {
            return;
        }
        writeMessage(message);
        if (this.priority.getIndex() < priority.getIndex()) {
            nextNotifier.sendMessage(message, priority);
        }
    }

    public abstract void writeMessage(String message);
}
