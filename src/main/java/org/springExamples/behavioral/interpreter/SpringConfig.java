package org.springExamples.behavioral.interpreter;

import org.springExamples.behavioral.interpreter.expresions.TerminalExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    public TerminalExpression terminalExpressionJava() {
        return new TerminalExpression("Java");
    }

    @Bean
    public TerminalExpression terminalExpressionSpring() {
        return new TerminalExpression("Spring");
    }
}
