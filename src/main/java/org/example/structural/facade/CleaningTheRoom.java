package org.example.structural.facade;

public class CleaningTheRoom {

    private final ScanningWhatToClean scanning = new ScanningWhatToClean();
    private final GatheringMess gatheringMess = new GatheringMess();
    private final PuttingThingsInOrder puttingThingsInOrder = new PuttingThingsInOrder();

    public void makeCleaning() {

        System.out.println("starting to clean the room\n");

        scanning.scan();
        gatheringMess.gatherMess();
        gatheringMess.removeMess();
        puttingThingsInOrder.putInOrder();

        System.out.println("\nthe room is cleaned");
    }
}
