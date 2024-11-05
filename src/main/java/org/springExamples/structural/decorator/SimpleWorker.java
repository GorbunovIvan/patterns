package org.springExamples.structural.decorator;

import org.springframework.stereotype.Component;

@Component
public class SimpleWorker implements Employee {

    @Override
    public String doWork() {
        return "doing simple work";
    }
}
