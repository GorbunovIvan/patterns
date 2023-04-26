package org.springExamples.structural.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CleaningTheRoom {

    private ScanningWhatToClean scanning;
    private GatheringMess gatheringMess;
    private PuttingThingsInOrder puttingThingsInOrder;

    @Autowired
    public void setScanning(ScanningWhatToClean scanning) {
        this.scanning = scanning;
    }

    @Autowired
    public void setGatheringMess(GatheringMess gatheringMess) {
        this.gatheringMess = gatheringMess;
    }

    @Autowired
    public void setPuttingThingsInOrder(PuttingThingsInOrder puttingThingsInOrder) {
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
