package org.springExamples.behavioral.memento;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Project {

    private String version;
    private LocalDateTime date;

    public final GitHub gitHub;

    private final BeanFactory beanFactory;

    @Autowired
    public Project(GitHub gitHub, BeanFactory beanFactory) {
        this.gitHub = gitHub;
        this.beanFactory = beanFactory;
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
//        Save save = new Save(version, date);
        Save save = beanFactory.getBean(Save.class, version, date);
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
