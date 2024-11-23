package org.springExamples.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class GitHub {

    private final List<Save> saves = new ArrayList<>();

    public List<Save> getSaves() {
        return saves;
    }

    public Save getLastSave() {
        if (saves.isEmpty()) {
            return null;
        }
        return saves.getLast();
    }

    public Save getSaveByVersion(String version) {
        return saves.stream()
                .filter(s -> s.version.equals(version))
                .findAny()
                .orElse(null);
    }

    public void push(Save save) {
        saves.add(save);
    }

    @Override
    public String toString() {
        if (saves.isEmpty()) {
            return "GitHub{}";
        }
        return "GitHub{total number of saves is " + saves.size() +
                ", last save is: " + getLastSave() + "}";
    }
}
