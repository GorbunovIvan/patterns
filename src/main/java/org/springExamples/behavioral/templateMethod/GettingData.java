package org.springExamples.behavioral.templateMethod;

import org.springframework.stereotype.Component;

@Component
public class GettingData extends WorkingWithDatabaseTemplate {
    @Override
    public void doTask() {
        System.out.println("getting data from database");
    }
}
