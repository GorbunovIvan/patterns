package org.example.creational.prototype;

public class BikeFactory {
    Bike bike;

    public BikeFactory(Bike bike) {
        this.bike = bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public Bike getNewCopy() {
        return bike.copy();
    }
}
