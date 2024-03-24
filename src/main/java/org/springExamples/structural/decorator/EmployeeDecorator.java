package org.springExamples.structural.decorator;

import org.springframework.stereotype.Component;

@Component
public abstract class EmployeeDecorator implements Employee {

    protected final Employee employee;

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String doWork() {
        return employee.doWork();
    }
}
