package org.example.behavioral.observer;

public class Main {

    public static void main(String[] args) {

        JobSite jobSite = new JobSite();

        jobSite.addVacancy("first vacancy");
        jobSite.addVacancy("second vacancy");
        jobSite.addObserver(new Subscriber("First subscriber"));
        jobSite.addObserver(new Subscriber("Second subscriber"));

        jobSite.addVacancy("third vacancy");
        jobSite.removeVacancy("first vacancy");

        // Making one-to-many connection.
        // When one object must notify others without making assumptions about those other objects or whether they exist.
        // Classes are connected without informing them about their connection - so they only work with "event".
    }
}
