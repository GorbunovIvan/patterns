package org.springExamples.structural.bridge.activities;

import org.springframework.stereotype.Component;

@Component
public class YoutubeRunning implements Activity {
    @Override
    public void act() {
        System.out.print("running YouTube");
    }
}
