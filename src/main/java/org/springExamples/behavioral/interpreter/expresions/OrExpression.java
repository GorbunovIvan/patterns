package org.springExamples.behavioral.interpreter.expresions;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class OrExpression implements Expression {

    private Expression expression1;
    private Expression expression2;

    public OrExpression() {}

    public void setExpressions(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}
