package org.springExamples.structural.facade;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        CleaningTheRoom cleaning = context.getBean(CleaningTheRoom.class);
        cleaning.makeCleaning();

        context.close();

        // We encapsulated some classes in a single class to manage their functionality as a single process
    }
}
