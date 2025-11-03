package org.springExamples.behavioral.iterator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.lang.NonNull;

import java.util.List;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    House house(@Qualifier("roomsForHouse") List<Room> roomsForHouse) {
        var house = new House();
        roomsForHouse.forEach(house::addRoom);
        return house;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    List<Room> roomsForHouse(@NonNull RoomFactory roomFactory, @NonNull WindowFactory windowFactory) {

        var rooms = roomFactory.generateObjects(4);

        rooms.get(0).setWindows(windowFactory.generateObjects(2));
        rooms.get(1).setWindows(windowFactory.generateObjects(2));
        rooms.get(2).setWindows(windowFactory.generateObjects(1));
        rooms.get(3).setWindows(windowFactory.generateObjects(3));

        return rooms;
    }

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        var house = context.getBean(House.class);

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
