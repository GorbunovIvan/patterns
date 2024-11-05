package org.springExamples.structural.facade;

import org.springframework.stereotype.Component;

@Component
public class CleaningTheRoom {

    private final ScanningWhatToClean scanning;
    private final GatheringMess gatheringMess;
    private final PuttingThingsInOrder puttingThingsInOrder;

    public CleaningTheRoom(ScanningWhatToClean scanning,
                           GatheringMess gatheringMess,
                           PuttingThingsInOrder puttingThingsInOrder) {
        this.scanning = scanning;
        this.gatheringMess = gatheringMess;
        this.puttingThingsInOrder = puttingThingsInOrder;
    }


    public void makeCleaning() {

        System.out.println("starting to clean the room\n");

        scanning.scan();
        gatheringMess.gatherMess();
        gatheringMess.removeMess();
        puttingThingsInOrder.putInOrder();

        System.out.println("\nthe room is cleaned");
    }
}
