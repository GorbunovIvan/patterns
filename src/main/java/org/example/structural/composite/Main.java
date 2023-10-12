package org.example.structural.composite;

public class Main {

    public static void main(String[] args) {

        // Tree-like structure - each parent object has a collection of smaller objects and so on.
        House house = new House();

        Window window1 = new BigWindow();
        Window window2 = new SmallWindow();
        Window window3 = new BigWindow();
        Window window4 = new SmallWindow();
        Window window5 = new BigWindow();
        Window window6 = new BigWindow();
        Window window7 = new SmallWindow();

        Room hall = new Hall();
        hall.addWindow(window1);
        hall.addWindow(window2);

        Room corridor = new Corridor();
        corridor.addWindow(window3);
        corridor.addWindow(window4);

        Room bedRoom1 = new BedRoom();
        bedRoom1.addWindow(window5);

        Room bedRoom2 = new BedRoom();
        bedRoom2.addWindow(window6);
        bedRoom2.addWindow(window7);

        house.addRoom(hall);
        house.addRoom(corridor);
        house.addRoom(bedRoom1);
        house.addRoom(bedRoom2);

        house.buildHouse();
    }
}
