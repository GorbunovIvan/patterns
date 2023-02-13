package org.example.behavioral.iterator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        House house = new House();
        house.rooms.add(new Room(1, List.of(new Window(1), new Window(2))));
        house.rooms.add(new Room(2, List.of(new Window(3), new Window(4))));
        house.rooms.add(new Room(3, List.of(new Window(5))));
        house.rooms.add(new Room(4, List.of(new Window(6), new Window(7), new Window(8))));

        System.out.println("-- Iterator -- ");
        Iterator<EntityOfHouse> iterator = house.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("\n-- Deep iterator -- ");
        iterator = house.deepIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
