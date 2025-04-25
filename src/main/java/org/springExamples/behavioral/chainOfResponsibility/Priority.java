package org.springExamples.behavioral.chainOfResponsibility;

public enum Priority {

    SIMPLE(1),
    IMPORTANT(2),
    ASAP(3);  // As soon as possible

    private final int index;

    Priority(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static Priority getByIndex(int index) {
        for (Priority priority : Priority.values()) {
            if (priority.index == index) {
                return priority;
            }
        }
        throw new IllegalArgumentException();
    }
}
