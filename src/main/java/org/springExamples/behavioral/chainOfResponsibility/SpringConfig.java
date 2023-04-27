package org.springExamples.behavioral.chainOfResponsibility;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    public Priority simplePriority() {
        return Priority.SIMPLE;
    }

    @Bean
    public Priority importantPriority() {
        return Priority.IMPORTANT;
    }

    @Bean
    public Priority asapPriority() {
        return Priority.ASAP;
    }
}
