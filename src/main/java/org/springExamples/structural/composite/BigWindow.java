package org.springExamples.structural.composite;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BigWindow implements Window {
    @Override
    public void buildWindow() {
        System.out.println("        building big window");
    }
}
