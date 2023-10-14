package org.springExamples.behavioral.iterator;

import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    @Scope("prototype")
    public House house(List<Room> rooms) {
        House house = new House();
        rooms.forEach(house::addRoom);
        return house;
    }

    @Bean
    @Scope("prototype")
    public List<Room> rooms(List<Window> windows) {

        List<Room> rooms = new ArrayList<>();

        rooms.add(new Room(1, List.of(windows.get(0), windows.get(1))));
        rooms.add(new Room(2, List.of(windows.get(2), windows.get(3))));
        rooms.add(new Room(3, List.of(windows.get(4))));
        rooms.add(new Room(4, List.of(windows.get(5), windows.get(6), windows.get(7))));

        return rooms;
    }

    @Bean
    @Scope("prototype")
    public List<Window> windows() {
        return IntStream.range(1, 9)
                .mapToObj(Window::new)
                .toList();
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
