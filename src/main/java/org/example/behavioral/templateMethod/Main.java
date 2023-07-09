package org.example.behavioral.templateMethod;

public class Main {

    public static void main(String[] args) {

        WorkingWithDatabaseTemplate gettingData = new GettingData();
        gettingData.workWithDataBase();

        System.out.println("--------------");

        WorkingWithDatabaseTemplate savingData = new SavingData();
        savingData.workWithDataBase();

        // Defines the skeleton of an algorithm in an operation, deferring some steps to subclasses.
        // Template method lets subclasses redefine certain steps of an algorithm
        // without changing the algorithm's structure.
    }
}
