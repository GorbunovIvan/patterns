package org.springExamples.behavioral.observer;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class JobSite implements Observed {

    private final Set<Observer> subscribers = new HashSet<>();
    private final Set<String> vacancies = new LinkedHashSet<>();

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
        subscribers.forEach(s -> s.handleEvent(vacancies));
    }
}
