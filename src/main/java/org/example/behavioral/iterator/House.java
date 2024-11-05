package org.example.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class House {

    private final List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Iterator<EntityOfHouse> iterator() {
        return new Iter(false);
    }

    public Iterator<EntityOfHouse> deepIterator() {
        return new Iter(true);
    }

    class Iter implements Iterator<EntityOfHouse> {
        private int roomIndex = 0;
        private Iterator<Window> iterOfWindowsOfCurrentRoom;
        private final boolean deep; // with windows
        public Iter(boolean deep) {
            this.deep = deep;
        }
        @Override
        public boolean hasNext() {
            return roomIndex < rooms.size();
        }
        @Override
        public EntityOfHouse next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Room currentRoom = rooms.get(roomIndex);
            if (deep) {
                if (iterOfWindowsOfCurrentRoom == null) {
                    iterOfWindowsOfCurrentRoom = currentRoom.iterator();
                }
                if (iterOfWindowsOfCurrentRoom.hasNext()) {
                    return iterOfWindowsOfCurrentRoom.next();
                }
                iterOfWindowsOfCurrentRoom = null;
            }
            roomIndex++;
            return currentRoom;
        }
    }
}
