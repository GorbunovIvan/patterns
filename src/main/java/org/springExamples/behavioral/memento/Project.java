package org.springExamples.behavioral.memento;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Project {

    private String version;
    private LocalDateTime date;

    public final GitHub gitHub;

    public Project(@Value("1") String version, GitHub gitHub) {
        this.version = version;
        this.gitHub = gitHub;
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
        Save save = newSave();
        save.setVersion(this.version);
        save.setDate(this.date);
        gitHub.push(save);
    }

    @Lookup
    public Save newSave() {
        return null;
    }

    public void loadVersion(String version) {
        Save save = gitHub.getSaveByVersion(version);
        if (save == null) {
            throw new IllegalArgumentException();
        }
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
