package org.springExamples.behavioral.observer;


import java.util.Set;

public interface Observer {
    void handleEvent(Set<String> vacancies);
}
