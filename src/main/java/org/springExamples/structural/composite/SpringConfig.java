package org.springExamples.structural.composite;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    @Scope("prototype")
    public House house(Room hall, Room corridor, Room bedRoom1, Room bedRoom2) {

        House house = new House();

        house.addRoom(hall);
        house.addRoom(corridor);
        house.addRoom(bedRoom1);
        house.addRoom(bedRoom2);

        house.buildHouse();

        return house;
    }

    @Bean
    @Scope("prototype")
    public Room hall(BigWindow bigWindow, SmallWindow smallWindow) {

        Room hall = new Hall();

        hall.addWindow(bigWindow);
        hall.addWindow(smallWindow);

        return hall;
    }

    @Bean
    @Scope("prototype")
    public Room corridor(BigWindow bigWindow, SmallWindow smallWindow) {

        Room corridor = new Corridor();

        corridor.addWindow(bigWindow);
        corridor.addWindow(smallWindow);

        return corridor;
    }

    @Bean
    @Scope("prototype")
    public Room bedRoom1(BigWindow bigWindow) {

        Room bedRoom1 = new BedRoom();

        bedRoom1.addWindow(bigWindow);

        return bedRoom1;
    }

    @Bean
    @Scope("prototype")
    public Room bedRoom2(BigWindow bigWindow, SmallWindow smallWindow) {

        Room bedRoom2 = new BedRoom();

        bedRoom2.addWindow(bigWindow);
        bedRoom2.addWindow(smallWindow);

        return bedRoom2;
    }

    public static void main(String[] args) {

        // Tree-like structure - each parent object has a collection of smaller objects and so on.
        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        var house = context.getBean(House.class);

        context.close();
    }
}
