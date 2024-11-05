package org.springExamples.behavioral.observer;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Subscriber implements Observer {

    public String name;

    private Subscriber(JobSite jobSite) {
        jobSite.addObserver(this);
    }

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
