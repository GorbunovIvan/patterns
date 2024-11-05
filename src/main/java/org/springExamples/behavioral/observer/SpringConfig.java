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

        var subscriber1 = context.getBean(Subscriber.class);
        subscriber1.setName("First subscriber");

        var subscriber2 = context.getBean(Subscriber.class);
        subscriber2.setName("Second subscriber");

        jobSite.addVacancy("third vacancy");
        jobSite.removeVacancy("first vacancy");

        context.close();

        // Making one-to-many connection.
        // When one object must notify others without making assumptions about those other objects or whether they exist
        // Classes are connected without informing them about their connection - so they only work with "event"
    }
}
