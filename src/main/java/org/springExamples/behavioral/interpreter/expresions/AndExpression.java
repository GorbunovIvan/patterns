package org.springExamples.behavioral.interpreter.expresions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AndExpression implements Expression {

    private final Expression expression1;
    private final Expression expression2;

    @Autowired
    public AndExpression(@Qualifier("terminalExpressionJava") Expression expression1,
                         @Qualifier("terminalExpressionSpring") Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
