package org.springExamples.structural.decorator;

public class SimpleWorker implements Employee {
    @Override
    public String doWork() {
        return "doing simple work";
    }
}
