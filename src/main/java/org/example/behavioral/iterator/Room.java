package org.example.behavioral.iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class Room implements EntityOfHouse {
    private final int id;

    final List<Window> windows;

    public Room(int id, List<Window> windows) {
        this.id = id;
        this.windows = windows;
    }

    public Iterator<Window> iterator() {
        return new Iter();
    }

    class Iter implements Iterator<Window> {
        private int windowIndex = 0;
        @Override
        public boolean hasNext() {
            return windowIndex < windows.size();
        }
        @Override
        public Window next() {
            if (!hasNext())
                throw new NoSuchElementException();
            return windows.get(windowIndex++);
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "id: " + id +
                ", number of windows: " + windows.size() +
                '}';
    }
}
