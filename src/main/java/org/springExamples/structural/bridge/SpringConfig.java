package org.springExamples.structural.bridge;

import org.springExamples.structural.bridge.activities.Activity;
import org.springExamples.structural.bridge.devices.Computer;
import org.springExamples.structural.bridge.devices.Device;
import org.springExamples.structural.bridge.devices.Smartphone;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    public Device smartphoneWithBookReaderRunning(@Qualifier("smartphone") Device smartphone,
                                                  @Qualifier("bookReaderRunning") Activity bookReaderRunning) {
        smartphone.setActivity(bookReaderRunning);
        return smartphone;
    }

    @Bean
    public Device smartphoneWithYoutubeRunning(@Qualifier("smartphone") Device smartphone,
                                               @Qualifier("youtubeRunning") Activity youtubeRunning) {
        smartphone.setActivity(youtubeRunning);
        return smartphone;
    }

    @Bean
    public Device computerWithBookReaderRunning(@Qualifier("computer") Device computer,
                                                @Qualifier("bookReaderRunning") Activity bookReaderRunning) {
        computer.setActivity(bookReaderRunning);
        return computer;
    }

    @Bean
    public Device computerWithYoutubeRunning(@Qualifier("computer") Device computer,
                                             @Qualifier("youtubeRunning") Activity youtubeRunning) {
        computer.setActivity(youtubeRunning);
        return computer;
    }

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Device[] devices = {
//                context.getBean("smartphoneWithBookReaderRunning", Smartphone.class),
//                context.getBean("computerWithYoutubeRunning", Computer.class)
                // we can change the matching between devices and activities
                context.getBean("smartphoneWithYoutubeRunning", Smartphone.class),
                context.getBean("computerWithBookReaderRunning", Computer.class)
        };

        for (var device : devices) {
            device.makeUse();
        }

        context.close();

        // The point is that the Device and the Activity abstractions and their implementations
        // are put in separate class hierarchies, so we can change the matching between their implementations.
    }
}
