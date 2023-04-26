package org.springExamples.structural.bridge;

import org.springExamples.structural.bridge.devices.Computer;
import org.springExamples.structural.bridge.devices.Device;
import org.springExamples.structural.bridge.devices.Smartphone;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Device[] devices = {
//                context.getBean("smartphone with book reader running", Smartphone.class),
//                context.getBean("computer with youtube running", Computer.class)
                // we can change the matching between devices and activities
                context.getBean("smartphone with youtube running", Smartphone.class),
                context.getBean("computer with book reader running", Computer.class)
        };

        for (var device : devices)
            device.makeUse();

        context.close();

        // The point is that the Device and the Activity abstractions and their implementations
        // are put in separate class hierarchies, so we can change the matching between their implementations.
    }
}
