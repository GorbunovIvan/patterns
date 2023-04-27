package org.springExamples.behavioral.iterator.beans;

public class Window implements EntityOfHouse {

    private final int id;

    private static int NEXT_ID = 1;

    public Window() {
        this.id = NEXT_ID++;
    }

    @Override
    public String toString() {
        return "Window{" +
                "id: " + id +
                '}';
    }
}
