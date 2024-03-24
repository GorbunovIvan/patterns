package org.springExamples.creational.singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        var logger = context.getBean(ProgramLogger.class);
        
        logger.addLog("first log");
        logger.addLog("second log");
        logger.addLog("third log");

        System.out.println(logger.getLogs());
        
        context.close();
    }
}