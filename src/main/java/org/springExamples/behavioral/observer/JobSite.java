package org.springExamples.behavioral.observer;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Component
public class JobSite implements Observed, ApplicationEventPublisherAware {

    private final Set<Observer> subscribers = new HashSet<>();
    private final Set<String> vacancies = new LinkedHashSet<>();

    private ApplicationEventPublisher eventPublisher;

    @Override
    public void setApplicationEventPublisher(@NonNull ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }

    public void addVacancy(String vacancy) {
        if (vacancies.add(vacancy)) {
            notifyObservers();
        }
    }

    public void removeVacancy(String vacancy) {
        if (vacancies.remove(vacancy)) {
            notifyObservers();
        }
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void notifyObservers() {
        var event = new EventVacancy(subscribers, vacancies);
        eventPublisher.publishEvent(event);
    }
}
