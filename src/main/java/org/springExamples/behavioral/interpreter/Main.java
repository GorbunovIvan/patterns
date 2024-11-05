package org.springExamples.behavioral.interpreter;

import org.springExamples.behavioral.interpreter.expresions.AndExpression;
import org.springExamples.behavioral.interpreter.expresions.Expression;
import org.springExamples.behavioral.interpreter.expresions.OrExpression;
import org.springExamples.behavioral.interpreter.expresions.TerminalExpression;

public class Main {

    public static void main(String[] args) {

        Expression expressionJava = new TerminalExpression("Java");
        Expression expressionSpring = new TerminalExpression("Spring");

        // The word "java" must contain at least one of the passed expressions
        Expression orExpression = new OrExpression(expressionJava, expressionSpring);
        System.out.println("is java developer: " + orExpression.interpret("java EE"));

        // The expression "Java spring" must contain both of the passed expressions
        Expression andExpression = new AndExpression(expressionJava, expressionSpring);
        System.out.println("is fullstack developer: " + andExpression.interpret("Java spring"));
    }
}
