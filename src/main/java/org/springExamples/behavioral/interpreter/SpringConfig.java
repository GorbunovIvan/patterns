package org.springExamples.behavioral.interpreter;

import org.springExamples.behavioral.interpreter.expresions.AndExpression;
import org.springExamples.behavioral.interpreter.expresions.Expression;
import org.springExamples.behavioral.interpreter.expresions.OrExpression;
import org.springExamples.behavioral.interpreter.expresions.TerminalExpression;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    public Expression javaTerminalExpression() {
        return new TerminalExpression("Java");
    }

    @Bean
    public Expression springTerminalExpression() {
        return new TerminalExpression("Spring");
    }

    @Bean
    public Expression orExpressionForJavaAndSpring(@Qualifier("javaTerminalExpression") Expression javaExpression,
                                   @Qualifier("springTerminalExpression") Expression springExpression) {
        return new OrExpression(javaExpression, springExpression);
    }

    @Bean
    public Expression andExpressionForJavaAndSpring(@Qualifier("javaTerminalExpression") Expression javaExpression,
                                   @Qualifier("springTerminalExpression") Expression springExpression) {
        return new AndExpression(javaExpression, springExpression);
    }

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // the word "java" must contain at least one of the expressions
        Expression orExpression = context.getBean("orExpressionForJavaAndSpring", Expression.class);
        System.out.println("is java developer: " + orExpression.interpret("java"));

        // the expression "Java spring" must contain both of the expressions
        Expression andExpression = context.getBean("andExpressionForJavaAndSpring", Expression.class);
        System.out.println("is fullstack developer: " + andExpression.interpret("Java spring"));

        context.close();
    }
}
