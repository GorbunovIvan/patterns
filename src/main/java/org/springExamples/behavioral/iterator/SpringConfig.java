package org.springExamples.behavioral.iterator;

import org.springExamples.behavioral.iterator.beans.House;
import org.springExamples.behavioral.iterator.beans.Room;
import org.springExamples.behavioral.iterator.beans.Window;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    public House house() {

        House house = new House();

        house.addRoom(roomWithWindowOfNumber2());
        house.addRoom(roomWithWindowOfNumber2());
        house.addRoom(roomWithWindowOfNumber1());
        house.addRoom(roomWithWindowOfNumber3());

        return house;
    }

    @Bean
    @Scope("prototype")
    public Room roomWithWindowOfNumber1() {
        return new Room(listOfWindowsOfNumber1());
    }

    @Bean
    @Scope("prototype")
    public Room roomWithWindowOfNumber2() {
        return new Room(listOfWindowsOfNumber2());
    }

    @Bean
    @Scope("prototype")
    public Room roomWithWindowOfNumber3() {
        return new Room(listOfWindowsOfNumber3());
    }

    @Bean
    @Scope("prototype")
    public List<Window> listOfWindowsOfNumber1() {
        return listOfWindows(1);
    }

    @Bean
    @Scope("prototype")
    public List<Window> listOfWindowsOfNumber2() {
        return listOfWindows(2);
    }

    @Bean
    @Scope("prototype")
    public List<Window> listOfWindowsOfNumber3() {
        return listOfWindows(3);
    }

    public List<Window> listOfWindows(int number) {

        List<Window> windows = new ArrayList<>();

        for (int i = 1; i <= number; i++)
            windows.add(window());

        return windows;
    }

    @Bean
    @Scope("prototype")
    public Window window() {
        return new Window();
    }
}
