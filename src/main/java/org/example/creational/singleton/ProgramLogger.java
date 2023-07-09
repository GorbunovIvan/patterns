package org.example.creational.singleton;

public class ProgramLogger { // also may be final if necessary

    private static ProgramLogger logger;
    private final StringBuffer logs;

    public synchronized static ProgramLogger getLogger() {
        if (logger == null)
            logger = new ProgramLogger();
        return logger;
    }

    private ProgramLogger() {
        logs = new StringBuffer();
    }

    public void addLog(String log) {
        if (!logs.isEmpty())
            logs.append('\n');
        logs.append(log);
    }

    public String getLogs() {
        return logs.toString();
    }
}
