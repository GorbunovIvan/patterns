package org.springExamples.behavioral.observer;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class VacanciesEventsListener {

    @EventListener
    private void listen(EventVacancy event) {
        event.subscribers().forEach(subscriber -> subscriber.handleEvent(event.vacancies()));
    }
}
