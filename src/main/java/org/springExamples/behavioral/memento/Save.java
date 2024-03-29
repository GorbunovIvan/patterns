package org.springExamples.behavioral.memento;

import java.time.LocalDateTime;

public class Save {

    public final String version;
    public final LocalDateTime date;

    public Save(String version, LocalDateTime date) {
        this.version = version;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Save{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }
}
