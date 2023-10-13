package org.springExamples.structural.facade;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ScanningWhatToClean {
    public void scan() {
        System.out.println("scanning the room");
    }
}
