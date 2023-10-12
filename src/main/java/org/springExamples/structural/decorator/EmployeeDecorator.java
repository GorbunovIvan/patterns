package org.springExamples.structural.decorator;

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
