package org.springExamples.structural.facade;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class GatheringMess {

    public void gatherMess() {
        System.out.println("gathering the mess");
    }
    public void removeMess() {
        System.out.println("removing the mess");
    }
}
