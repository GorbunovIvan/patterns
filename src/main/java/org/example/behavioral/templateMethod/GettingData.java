package org.example.behavioral.templateMethod;

public class GettingData extends WorkingWithDatabaseTemplate {

    @Override
    public void doTask() {
        System.out.println("getting data from database");
    }
}
