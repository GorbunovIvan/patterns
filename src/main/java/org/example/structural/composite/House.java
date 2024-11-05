package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class House {

    private final List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void buildHouse() {
        System.out.println("building house");
        for (var room : rooms) {
            room.buildRoom();
        }
    }
}
