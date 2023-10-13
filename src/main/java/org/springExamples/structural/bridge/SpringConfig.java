package org.springExamples.structural.bridge;

import org.springExamples.structural.bridge.activities.Activity;
import org.springExamples.structural.bridge.devices.Device;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    public Device bookReaderRunningOnSmartphone(Device smartphone, Activity bookReaderRunning) {
        smartphone.setActivity(bookReaderRunning);
        return smartphone;
    }

    @Bean
    public Device youtubeRunningOnComputer(Device computer, Activity youtubeRunning) {
        computer.setActivity(youtubeRunning);
        return computer;
    }

    @Bean
    public Device youtubeRunningOnSmartphone(Device smartphone, Activity youtubeRunning) {
        smartphone.setActivity(youtubeRunning);
        return smartphone;
    }

    @Bean
    public Device bookReaderRunningOnComputer(Device computer, Activity bookReaderRunning) {
        computer.setActivity(bookReaderRunning);
        return computer;
    }

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Device[] devices = {
//                context.getBean("bookReaderRunningOnSmartphone", Device.class),
//                context.getBean("youtubeRunningOnComputer", Device.class)
                // we can change the matching between devices and activities
                context.getBean("youtubeRunningOnSmartphone", Device.class),
                context.getBean("bookReaderRunningOnComputer", Device.class)
        };

        for (var device : devices) {
            device.makeUse();
        }

        context.close();

        // The point is that the Device and the Activity abstractions and their implementations
        // are put in separate class hierarchies, so we can change the matching between their implementations.
    }
}
