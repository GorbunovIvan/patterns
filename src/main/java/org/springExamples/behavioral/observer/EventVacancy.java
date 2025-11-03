package org.springExamples.behavioral.observer;

import java.util.Set;

public record EventVacancy(Set<Observer> subscribers, Set<String> vacancies) {
}
