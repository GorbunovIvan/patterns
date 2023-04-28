package org.springExamples.behavioral.observer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Scope("prototype")
public class Subscriber implements Observer {

    public String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(Set<String> vacancies) {
        System.out.println("Dear " + name + ", current vacancies are as follows: ");
        vacancies.forEach(System.out::println);
        System.out.println("--------------------------");
    }
}
