package org.springExamples.structural.composite.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class BedRoom implements Room {

    private List<Window> windows;

    @Autowired
    public void setWindows(List<Window> windows) {
        this.windows = windows;
    }

    @Override
    public void buildRoom() {
        System.out.println("    building bedroom");
        for (var window : windows)
            window.buildWindow();
    }
}
