package org.example.structural.facade;

public class Main {

    public static void main(String[] args) {

//        // Before
//        ScanningWhatToClean scanning = new ScanningWhatToClean();
//        scanning.scan();
//
//        GatheringMess gatheringMess = new GatheringMess();
//        gatheringMess.gatherMess();
//        gatheringMess.removeMess();
//
//        PuttingThingsInOrder puttingThingsInOrder = new PuttingThingsInOrder();
//        puttingThingsInOrder.putInOrder();

        // After
        CleaningTheRoom cleaning = new CleaningTheRoom();
        cleaning.makeCleaning();

        // We encapsulated some classes in a single class to manage their functionality as a single process,
        // ensuring "Single Responsibility"
    }
}
