package org.springExamples.behavioral.observer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        JobSite jobSite = context.getBean(JobSite.class);

        // adding vacancies to the site
        jobSite.addVacancy("first vacancy");
        jobSite.addVacancy("second vacancy");

        // creating subscribers
        Subscriber subscriber1 = context.getBean(Subscriber.class);
        subscriber1.setName("First subscriber");

        Subscriber subscriber2 = context.getBean(Subscriber.class);
        subscriber2.setName("Second subscriber");

        // adding subscribers to the site
        jobSite.addObserver(subscriber1);
        jobSite.addObserver(subscriber2);

        // changes in the vacancies happen
        jobSite.addVacancy("third vacancy");
        jobSite.removeVacancy("first vacancy");

        context.close();

        // Making one-to-many connection.
        // When one object must notify others without making assumptions about those other objects or whether they exist.
        // Classes are connected without informing them about their connection - so they only work with "event"
    }
}
