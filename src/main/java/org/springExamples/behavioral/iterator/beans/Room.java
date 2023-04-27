package org.springExamples.behavioral.iterator.beans;

import java.util.List;
import java.util.NoSuchElementException;

public class Room implements EntityOfHouse {

    private final int id;
    private static int NEXT_ID = 1;

    final List<Window> windows;

    public Room(List<Window> windows) {
        this.id = NEXT_ID++;
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
