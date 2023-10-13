package org.springExamples.structural.facade;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PuttingThingsInOrder {
    public void putInOrder() {
        System.out.println("ordering things");
    }
}
