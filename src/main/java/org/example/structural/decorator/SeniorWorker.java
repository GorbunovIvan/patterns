package org.example.structural.decorator;

public class SeniorWorker extends EmployeeDecorator {

    public SeniorWorker(Employee employee) {
        super(employee);
    }

    @Override
    public String doWork() {
        return employee.doWork() + " and reviewing work of others";
    }
}
