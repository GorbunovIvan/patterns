package org.springExamples.behavioral.templateMethod;

public class SavingData extends WorkingWithDatabaseTemplate {
    @Override
    public void doTask() {
        System.out.println("saving data to database");
    }
}
