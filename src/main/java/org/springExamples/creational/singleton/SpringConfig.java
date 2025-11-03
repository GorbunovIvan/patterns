package org.springExamples.creational.singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        context.getBean(ProgramLogger.class).addLog("first log");
        context.getBean(ProgramLogger.class).addLog("second log");
        context.getBean(ProgramLogger.class).addLog("third log");

        System.out.println(context.getBean(ProgramLogger.class).getLogs());

        context.close();
    }
}