package org.example.creational.singleton;

public class Main {
    public static void main(String[] args) {
        ProgramLogger.getLogger().addLog("first log");
        ProgramLogger.getLogger().addLog("second log");
        ProgramLogger.getLogger().addLog("third log");
        System.out.println(ProgramLogger.getLogger().getLogs());
    }
}
