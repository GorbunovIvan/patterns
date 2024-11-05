package org.springExamples.behavioral.templateMethod;

import org.springframework.stereotype.Component;

@Component
public class SavingData extends WorkingWithDatabaseTemplate {

    @Override
    public void doTask() {
        System.out.println("saving data to database");
    }
}
