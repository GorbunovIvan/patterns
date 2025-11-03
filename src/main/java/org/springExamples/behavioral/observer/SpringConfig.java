package org.springExamples.behavioral.observer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        JobSite jobSite = context.getBean(JobSite.class);

        jobSite.addVacancy("first vacancy");
        jobSite.addVacancy("second vacancy");

        var sub1 = context.getBean(Subscriber.class);
        sub1.setName("First subscriber");

        var sub2 = context.getBean(Subscriber.class);
        sub2.setName("Second subscriber");

        jobSite.addObserver(sub1);
        jobSite.addObserver(sub2);

        jobSite.addVacancy("third vacancy");
        jobSite.removeVacancy("first vacancy");

        context.close();

        // Making one-to-many connection.
        // When one object must notify others without making assumptions about those other objects or whether they exist.
        // Classes are connected without informing them about their connection - so they only work with "event".
    }
}
