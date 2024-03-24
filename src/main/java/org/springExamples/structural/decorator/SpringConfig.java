package org.springExamples.structural.decorator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    public SeniorWorker seniorWorker(@Qualifier("simpleWorker") Employee employee) {
        return new SeniorWorker(employee);
    }

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Employee employee = context.getBean(SeniorWorker.class);
        System.out.println(employee.doWork());

        context.close();

        // A decorator is just a "copy" of a class that we can't extend, so we encapsulate it (via association)
        // and then we can easily extend that decorator class and add our functionality
    }
}
