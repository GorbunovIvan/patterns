package org.springExamples.behavioral.observer;

import java.util.Set;

public class Subscriber implements Observer {

    public final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(Set<String> vacancies) {
        System.out.println("Dear " + name + ", current vacancies are as follows: ");
        vacancies.forEach(System.out::println);
        System.out.println("--------------------------");
    }
}
