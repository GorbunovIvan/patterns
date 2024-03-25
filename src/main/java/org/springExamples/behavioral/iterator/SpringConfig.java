package org.springExamples.behavioral.iterator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    public House house(@Qualifier("roomsWithWindows") List<Room> rooms) {
        var house = new House();
        rooms.forEach(house::addRoom);
        return house;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public List<Room> roomsWithWindows(@Qualifier("windowsWithId") List<Window> windows) {
        return List.of(
                new Room(1, List.of(windows.get(0), windows.get(1))),
                new Room(2, List.of(windows.get(2), windows.get(3))),
                new Room(3, List.of(windows.get(4))),
                new Room(4, List.of(windows.get(5), windows.get(6), windows.get(7)))
        );
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public List<Window> windowsWithId() {
        var windows = new ArrayList<Window>();
        for (int i = 1; i <= 8; i++) {
            windows.add(new Window(i));
        }
        return windows;
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
