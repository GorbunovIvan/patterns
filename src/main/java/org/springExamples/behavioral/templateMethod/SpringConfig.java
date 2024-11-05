package org.springExamples.behavioral.templateMethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        WorkingWithDatabaseTemplate gettingData = context.getBean(GettingData.class);
        gettingData.workWithDataBase();

        System.out.println("--------------");

        WorkingWithDatabaseTemplate savingData = context.getBean(SavingData.class);
        savingData.workWithDataBase();

        context.close();

        // Defines the skeleton of an algorithm in an operation, deferring some steps to subclasses.
        // Template method lets subclasses redefine certain steps of an algorithm
        // without changing the algorithm's structure.
    }
}
