package org.springExamples.structural.decorator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SeniorWorker extends EmployeeDecorator {

    @Autowired
    public SeniorWorker(@Qualifier("simpleWorker") Employee employee) {
        super(employee);
    }

    public String doWork() {
        return employee.doWork() + " and reviewing work of others";
    }
}
