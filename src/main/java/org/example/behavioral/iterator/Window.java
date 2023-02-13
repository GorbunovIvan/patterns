package org.example.behavioral.iterator;

public class Window implements EntityOfHouse {
    private final int id;

    public Window(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Window{" +
                "id: " + id +
                '}';
    }
}
