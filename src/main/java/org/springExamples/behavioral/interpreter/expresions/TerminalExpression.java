package org.springExamples.behavioral.interpreter.expresions;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression() {}

    public void setData(String data) {
        this.data = data.toLowerCase();
    }

    @Override
    public boolean interpret(String context) {
        return context.toLowerCase().contains(data);
    }
}
