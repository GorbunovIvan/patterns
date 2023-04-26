package org.example.structural.decorator;

public abstract class EmployeeDecorator implements Employee {
    protected Employee employee;

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String doWork() {
        return employee.doWork();
    }
}
