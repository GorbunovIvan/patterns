package org.springExamples.behavioral.memento;

import java.time.LocalDateTime;

public class Project {

    private String version;
    private LocalDateTime date;

    public final GitHub gitHub = new GitHub();

    public Project(String version) {
        this.version = version;
        this.date = LocalDateTime.now();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
        this.date = LocalDateTime.now();
    }

    public void saveVersion() {
        Save save = new Save(version, date);
        gitHub.push(save);
    }

    public void loadVersion(String version) {
        Save save = gitHub.getSaveByVersion(version);
        if (save == null)
            throw new IllegalArgumentException();
        this.version = save.version;
        this.date = save.date;
    }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }
}
