package org.example.behavioral.templateMethod;

public abstract class WorkingWithDatabaseTemplate {

    public void workWithDataBase() {
        System.out.println("connecting to the database");
        doTask();
        System.out.println("closing connection to the database");
    }

    public abstract void doTask();
}
