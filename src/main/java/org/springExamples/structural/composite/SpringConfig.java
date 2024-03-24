package org.springExamples.structural.composite;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

import java.util.List;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    public House compositedHouse(House house,
                                 @Qualifier("roomsForHouse") List<Room> roomsForHouse) {
        roomsForHouse.forEach(house::addRoom);
        house.buildHouse();
        return house;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public List<Room> roomsForHouse(@Qualifier("hallWithWindows") Room hall,
                                    @Qualifier("corridorWithWindows") Room corridor,
                                    @Qualifier("bedRoomWithOneBigWindow") Room bedRoom1,
                                    @Qualifier("bedRoomWithWindows") Room bedRoom2) {
        return List.of(
                hall,
                corridor,
                bedRoom1,
                bedRoom2
        );
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Room hallWithWindows(@Qualifier("hall") Room hall,
                                @Qualifier("bigWindow") Window bigWindow,
                                @Qualifier("smallWindow") Window smallWindow) {
        hall.addWindow(bigWindow);
        hall.addWindow(smallWindow);
        return hall;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Room corridorWithWindows(@Qualifier("corridor") Room corridor,
                                    @Qualifier("bigWindow") Window bigWindow,
                                    @Qualifier("smallWindow") Window smallWindow) {
        corridor.addWindow(bigWindow);
        corridor.addWindow(smallWindow);
        return corridor;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Room bedRoomWithOneBigWindow(@Qualifier("bedRoom") Room bedRoom,
                                        @Qualifier("bigWindow") Window bigWindow) {
        bedRoom.addWindow(bigWindow);
        return bedRoom;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Room bedRoomWithWindows(@Qualifier("bedRoom") Room bedRoom,
                                   @Qualifier("bigWindow") Window bigWindow,
                                   @Qualifier("smallWindow") Window smallWindow) {
        bedRoom.addWindow(bigWindow);
        bedRoom.addWindow(smallWindow);
        return bedRoom;
    }

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // Tree-like structure - each parent object has a collection of smaller objects and so on.
        var house = context.getBean("compositedHouse", House.class);

        context.close();
    }
}
