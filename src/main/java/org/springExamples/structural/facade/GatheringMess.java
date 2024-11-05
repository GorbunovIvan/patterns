package org.springExamples.structural.facade;

import org.springframework.stereotype.Component;

@Component
public class GatheringMess {

    public void gatherMess() {
        System.out.println("gathering the mess");
    }
    public void removeMess() {
        System.out.println("removing the mess");
    }
}
