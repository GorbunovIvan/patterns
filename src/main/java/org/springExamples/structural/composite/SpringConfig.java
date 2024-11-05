package org.springExamples.structural.composite;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    public House house(List<Room> roomsForHouse) {
        var house = new House();
        roomsForHouse.forEach(house::addRoom);
        return house;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public List<Room> roomsForHouse(Room hall, Room corridor, Room bedRoom1, Room bedRoom2) {
        var rooms = new ArrayList<Room>();
        rooms.add(hall);
        rooms.add(corridor);
        rooms.add(bedRoom1);
        rooms.add(bedRoom2);
        return rooms;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Room hall(Window bigWindow, Window smallWindow) {
        var hall = new Hall();
        hall.addWindow(bigWindow);
        hall.addWindow(smallWindow);
        return hall;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Room corridor(Window bigWindow, Window smallWindow) {
        var corridor = new Corridor();
        corridor.addWindow(bigWindow);
        corridor.addWindow(smallWindow);
        return corridor;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Room bedRoom1(Window bigWindow) {
        var bedRoom = new BedRoom();
        bedRoom.addWindow(bigWindow);
        return bedRoom;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Room bedRoom2(Window bigWindow, Window smallWindow) {
        var bedRoom = new BedRoom();
        bedRoom.addWindow(bigWindow);
        bedRoom.addWindow(smallWindow);
        return bedRoom;
    }

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // Tree-like structure - each parent object has a collection of smaller objects and so on.
        var house = context.getBean(House.class);
        house.buildHouse();

        context.close();
    }
}
