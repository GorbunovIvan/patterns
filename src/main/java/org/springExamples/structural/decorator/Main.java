package org.springExamples.structural.decorator;

public class Main {

    public static void main(String[] args) {

//        // Before
//        Employee employee = new SimpleWorker();
//        System.out.println(employee.doWork());

        // After
        Employee employee = new SeniorWorker(new SimpleWorker());
        System.out.println(employee.doWork());

        // A decorator is just a "copy" of a class that we can't extend, so we encapsulate it (via association)
        // and then we can easily extend that decorator class and add our functionality
    }
}
