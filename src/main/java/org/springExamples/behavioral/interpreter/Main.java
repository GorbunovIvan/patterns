package org.springExamples.behavioral.interpreter;

import org.springExamples.behavioral.interpreter.expresions.AndExpression;
import org.springExamples.behavioral.interpreter.expresions.Expression;
import org.springExamples.behavioral.interpreter.expresions.OrExpression;
import org.springExamples.behavioral.interpreter.expresions.TerminalExpression;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // the word "java" must contain at least one of the expressions
        Expression orExpression = context.getBean(OrExpression.class);
        System.out.println("is java developer: " + orExpression.interpret("java"));

        // the expression "Java spring" must contain both of the expressions
        Expression andExpression = context.getBean(AndExpression.class);
        System.out.println("is fullstack developer: " + andExpression.interpret("Java spring"));

        context.close();
    }
}
