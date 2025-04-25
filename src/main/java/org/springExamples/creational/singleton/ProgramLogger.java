package org.springExamples.creational.singleton;

public class ProgramLogger {  // Can also be final if needed

    private static ProgramLogger logger;
    private final StringBuffer logs;

    public synchronized static ProgramLogger getLogger() {
        if (logger == null) {
            logger = new ProgramLogger();
        }
        return logger;
    }

    private ProgramLogger() {
        logs = new StringBuffer();
    }

    public void addLog(String log) {
        if (!logs.isEmpty()) {
            logs.append('\n');
        }
        logs.append(log);
    }

    public String getLogs() {
        return logs.toString();
    }
}
