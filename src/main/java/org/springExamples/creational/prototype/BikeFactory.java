package org.springExamples.creational.prototype;

import org.springframework.stereotype.Component;

@Component
public class BikeFactory {

    Bike bike;

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public Bike getNewCopy() {
        return bike.copy();
    }
}
