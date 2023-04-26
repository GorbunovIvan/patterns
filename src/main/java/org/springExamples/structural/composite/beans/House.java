package org.springExamples.structural.composite.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class House {

    private List<Room> rooms;

    @Autowired
    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void buildHouse() {
        System.out.println("building house");
        for (var room : rooms)
            room.buildRoom();
    }
}
