package org.springExamples.creational.singleton;

import org.springframework.stereotype.Component;

@Component
public class ProgramLogger {
    private final StringBuffer logs;

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
