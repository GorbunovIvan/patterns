package org.springExamples.structural.facade;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        CleaningTheRoom cleaning = context.getBean(CleaningTheRoom.class);
        cleaning.makeCleaning();

        context.close();

        // We encapsulated some classes in a single class to manage their functionality as a single process
    }
}
