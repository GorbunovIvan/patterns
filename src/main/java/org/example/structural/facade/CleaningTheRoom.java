package org.example.structural.facade;

public class CleaningTheRoom {
    private ScanningWhatToClean scanning = new ScanningWhatToClean();
    private GatheringMess gatheringMess = new GatheringMess();
    private PuttingThingsInOrder puttingThingsInOrder = new PuttingThingsInOrder();

    public void makeCleaning() {
        System.out.println("starting to clean the room\n");

        scanning.scan();
        gatheringMess.gatherMess();
        gatheringMess.removeMess();
        puttingThingsInOrder.putInOrder();

        System.out.println("\nthe room is cleaned");
    }

}
