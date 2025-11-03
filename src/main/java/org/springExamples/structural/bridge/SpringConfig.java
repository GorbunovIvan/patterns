package org.springExamples.structural.bridge;

import org.springExamples.structural.bridge.activities.BookReaderRunning;
import org.springExamples.structural.bridge.activities.YoutubeRunning;
import org.springExamples.structural.bridge.devices.Computer;
import org.springExamples.structural.bridge.devices.Device;
import org.springExamples.structural.bridge.devices.Smartphone;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    public Device smartphoneWithBookReaderRunning() {
        return new Smartphone(new BookReaderRunning());
    }
    @Bean
    public Device smartphoneWithYoutubeRunning() {
        return new Smartphone(new YoutubeRunning());
    }

    @Bean
    public Device computerWithBookReaderRunning() {
        return new Computer(new BookReaderRunning());
    }
    @Bean
    public Device computerWithYoutubeRunning() {
        return new Computer(new YoutubeRunning());
    }

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Device[] devices = {
//                context.getBean("smartphoneWithBookReaderRunning", Device.class),
//                context.getBean("computerWithYoutubeRunning", Device.class),
                // we can change the matching between devices and activities
                context.getBean("smartphoneWithYoutubeRunning", Device.class),
                context.getBean("computerWithBookReaderRunning", Device.class),
        };

        for (var device : devices) {
            device.makeUse();
        }

        context.close();

        // The point is that the Device and the Activity abstractions and their implementations
        // are put in separate class hierarchies, so we can change the matching between their implementations.
    }
}
