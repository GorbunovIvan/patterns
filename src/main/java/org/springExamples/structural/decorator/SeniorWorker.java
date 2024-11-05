package org.springExamples.structural.decorator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SeniorWorker extends EmployeeDecorator {

    public SeniorWorker(@Qualifier("simpleWorker") Employee employee) {
        super(employee);
    }

    @Override
    public String doWork() {
        return employee.doWork() + " and reviewing work of others";
    }
}
