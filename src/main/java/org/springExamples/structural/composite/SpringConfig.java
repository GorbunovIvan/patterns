package org.springExamples.structural.composite;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    House house(@Qualifier("hall") Room hall, @Qualifier("corridor") Room corridor,
                @Qualifier("bedRoom1") Room bedRoom1, @Qualifier("bedRoom2") Room bedRoom2) {

        var house = new House();
        house.addRoom(hall);
        house.addRoom(corridor);
        house.addRoom(bedRoom1);
        house.addRoom(bedRoom2);

        house.buildHouse();

        return house;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Room hall(@Qualifier("bigWindow") Window bigWindow,
              @Qualifier("smallWindow") Window smallWindow) {
        var hall = new Hall();
        hall.addWindow(bigWindow);
        hall.addWindow(smallWindow);
        return hall;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Room corridor(@Qualifier("bigWindow") Window bigWindow,
                  @Qualifier("smallWindow") Window smallWindow) {
        var corridor = new Corridor();
        corridor.addWindow(bigWindow);
        corridor.addWindow(smallWindow);
        return corridor;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Room bedRoom1(@Qualifier("bigWindow") Window bigWindow) {
        var bedRoom1 = new BedRoom();
        bedRoom1.addWindow(bigWindow);
        return bedRoom1;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Room bedRoom2(@Qualifier("bigWindow") Window bigWindow,
                  @Qualifier("smallWindow") Window smallWindow) {
        var bedRoom1 = new BedRoom();
        bedRoom1.addWindow(bigWindow);
        bedRoom1.addWindow(smallWindow);
        return bedRoom1;
    }

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.getBean(House.class);
        context.close();
    }
}
