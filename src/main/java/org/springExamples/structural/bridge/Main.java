package org.springExamples.structural.bridge;

import org.springExamples.structural.bridge.activities.BookReaderRunning;
import org.springExamples.structural.bridge.activities.YoutubeRunning;
import org.springExamples.structural.bridge.devices.Computer;
import org.springExamples.structural.bridge.devices.Device;
import org.springExamples.structural.bridge.devices.Smartphone;

public class Main {

    public static void main(String[] args) {

        Device[] devices = {
//                new Smartphone(new BookReaderRunning()),
//                new Computer(new YoutubeRunning())
                // we can change the matching between devices and activities
                new Smartphone(new YoutubeRunning()),
                new Computer(new BookReaderRunning())
        };

        for (var device : devices) {
            device.makeUse();
        }

        // The point is that the Device and the Activity abstractions and their implementations
        // are put in separate class hierarchies, so we can change the matching between their implementations.
    }
}
