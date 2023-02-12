package org.example.structural.decorator;

public abstract class EmployeeDecorator implements Employee {
    Employee employee;

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String doWork() {
        return employee.doWork();
    }
}
