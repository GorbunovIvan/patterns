package org.springExamples.behavioral.memento;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Save {

    public String version;
    public LocalDateTime date;

    public void setVersion(String version) {
        this.version = version;
    }

    public void setDate(LocalDateTime date) {
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
