package org.springExamples.behavioral.interpreter;

import org.springExamples.behavioral.interpreter.expresions.AndExpression;
import org.springExamples.behavioral.interpreter.expresions.Expression;
import org.springExamples.behavioral.interpreter.expresions.OrExpression;
import org.springExamples.behavioral.interpreter.expresions.TerminalExpression;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public TerminalExpression expressionJava() {
        return new TerminalExpression("Java");
    }

    @Bean
    public TerminalExpression expressionSpring() {
        return new TerminalExpression("Spring");
    }

    @Bean
    public OrExpression expressionJavaOrSpring(@Qualifier("expressionJava") TerminalExpression expressionJava,
                                               @Qualifier("expressionSpring") TerminalExpression expressionSpring) {
        return new OrExpression(expressionJava, expressionSpring);
    }

    @Bean
    public AndExpression expressionJavaAndSpring(@Qualifier("expressionJava") TerminalExpression expressionJava,
                                               @Qualifier("expressionSpring") TerminalExpression expressionSpring) {
        return new AndExpression(expressionJava, expressionSpring);
    }

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // The word "java" must contain at least one of the passed expressions
        Expression orExpression = context.getBean("expressionJavaOrSpring", Expression.class);
        System.out.println("is java developer: " + orExpression.interpret("java EE"));

        // The expression "Java spring" must contain both of the passed expressions
        Expression andExpression = context.getBean("expressionJavaAndSpring", Expression.class);
        System.out.println("is fullstack developer: " + andExpression.interpret("Java spring"));

        context.close();
    }
}
