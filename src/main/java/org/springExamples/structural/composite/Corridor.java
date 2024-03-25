package org.springExamples.structural.composite;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Corridor implements Room {

    private final List<Window> windows = new ArrayList<>();

    public void addWindow(Window window) {
        windows.add(window);
    }

    @Override
    public void buildRoom() {
        System.out.println("    building corridor room");
        for (var window : windows)
            window.buildWindow();
    }
}
