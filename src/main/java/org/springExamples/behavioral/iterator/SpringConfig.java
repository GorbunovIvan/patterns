package org.springExamples.behavioral.iterator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class SpringConfig {

    @Bean
    public House house(List<Room> rooms) {
        var house = new House();
        rooms.forEach(house::addRoom);
        return house;
    }

    @Bean
    public List<Room> rooms(Map<Integer, List<Window>> windowsByRoomIds) {
        var rooms = new ArrayList<Room>();
        for (int id = 1; id <= 4; id++) {
            var room = new Room(id, windowsByRoomIds.get(id));
            rooms.add(room);
        }
        return rooms;
    }

    @Bean
    public Map<Integer, List<Window>> windowsByRoomIds() {
        var windowsByRoomIds = new HashMap<Integer, List<Window>>();
        windowsByRoomIds.put(1, List.of(new Window(1), new Window(2)));
        windowsByRoomIds.put(2, List.of(new Window(3), new Window(4)));
        windowsByRoomIds.put(3, List.of(new Window(5)));
        windowsByRoomIds.put(4, List.of(new Window(6), new Window(7), new Window(8)));
        return windowsByRoomIds;
    }

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        House house = context.getBean(House.class);

        System.out.println("-- Iterator -- ");
        Iterator<EntityOfHouse> iterator = house.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n-- Deep iterator -- ");
        iterator = house.deepIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        context.close();
    }
}
