package org.springExamples.behavioral.interpreter;

import org.springExamples.behavioral.interpreter.expresions.AndExpression;
import org.springExamples.behavioral.interpreter.expresions.OrExpression;
import org.springExamples.behavioral.interpreter.expresions.TerminalExpression;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        var expressionJava = context.getBean(TerminalExpression.class);
        expressionJava.setData("Java");

        var expressionSpring = context.getBean(TerminalExpression.class);
        expressionSpring.setData("Spring");

        // the word "java" must contain at least one of the expressions
        var orExpression = context.getBean(OrExpression.class);
        orExpression.setExpressions(expressionJava, expressionSpring);
        System.out.println("is java developer: " + orExpression.interpret("java"));

        // the expression "Java spring" must contain both of the expressions
        var andExpression = context.getBean(AndExpression.class);
        andExpression.setExpressions(expressionJava, expressionSpring);
        System.out.println("is fullstack developer: " + andExpression.interpret("Java spring"));

        context.close();
    }
}
