package org.example.behavioral.interpreter.expresions;

public class TerminalExpression implements Expression {

    private final String data;

    public TerminalExpression(String data) {
        this.data = data.toLowerCase();
    }

    @Override
    public boolean interpret(String context) {
        return context.toLowerCase().contains(data);
    }
}
