package org.springExamples.structural.bridge;

import org.springExamples.structural.bridge.activities.Activity;
import org.springExamples.structural.bridge.devices.Computer;
import org.springExamples.structural.bridge.devices.Device;
import org.springExamples.structural.bridge.devices.Smartphone;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class SpringConfig {

    @Bean
    public Device smartphoneWithYoutubeRunning(@Qualifier("youtubeRunning") Activity youtubeRunning) {
        return new Smartphone(youtubeRunning);
    }

    @Bean
    public Device smartphoneWithBookReaderRunning(@Qualifier("bookReaderRunning") Activity bookReaderRunning) {
        return new Smartphone(bookReaderRunning);
    }

    @Bean
    public Device computerWithYoutubeRunning(@Qualifier("youtubeRunning") Activity youtubeRunning) {
        return new Computer(youtubeRunning);
    }

    @Bean
    public Device computerWithBookReaderRunning(@Qualifier("bookReaderRunning") Activity bookReaderRunning) {
        return new Computer(bookReaderRunning);
    }

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Device[] devices = {
//                context.getBean("smartphoneWithBookReaderRunning", Device.class),
//                context.getBean("computerWithYoutubeRunning", Device.class)
//                // we can change the matching between devices and activities
                context.getBean("smartphoneWithYoutubeRunning", Device.class),
                context.getBean("computerWithBookReaderRunning", Device.class)
        };

        for (var device : devices) {
            device.makeUse();
        }

        context.close();

        // The point is that the Device and the Activity abstractions and their implementations
        // are put in separate class hierarchies, so we can change the matching between their implementations.
    }
}
