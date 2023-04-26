package org.springExamples.structural.bridge;

import org.springExamples.structural.bridge.activities.BookReaderRunning;
import org.springExamples.structural.bridge.activities.YoutubeRunning;
import org.springExamples.structural.bridge.devices.Computer;
import org.springExamples.structural.bridge.devices.Smartphone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    protected BookReaderRunning getBookReaderRunning() {
        return new BookReaderRunning();
    }

    @Bean
    protected YoutubeRunning getYoutubeRunning() {
        return new YoutubeRunning();
    }

    @Bean("smartphone with youtube running")
    public Smartphone getSmartphoneWithYoutubeRunning() {
        return new Smartphone(getYoutubeRunning());
    }

    @Bean("computer with book reader running")
    public Computer getComputerWithBookReaderRunning() {
        return new Computer(getBookReaderRunning());
    }

    @Bean("smartphone with book reader running")
    public Smartphone getSmartphoneWithBookReaderRunning() {
        return new Smartphone(getBookReaderRunning());
    }

    @Bean("computer with youtube running")
    public Computer getComputerWithYoutubeRunning() {
        return new Computer(getYoutubeRunning());
    }
}
