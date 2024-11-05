package org.springExamples.creational.singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        var programLogger = context.getBean(ProgramLogger.class);
        programLogger.addLog("first log");
        programLogger.addLog("second log");
        programLogger.addLog("third log");

        System.out.println(programLogger.getLogs());

        context.close();
    }
}