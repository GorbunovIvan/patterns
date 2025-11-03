package org.springExamples.creational.abstractFactory;

import org.springExamples.creational.abstractFactory.abstractConveyor.BodyMaker;
import org.springExamples.creational.abstractFactory.abstractConveyor.ConveyorFactory;
import org.springExamples.creational.abstractFactory.abstractConveyor.Stuffing;
import org.springExamples.creational.abstractFactory.abstractConveyor.WheelsAdder;
import org.springExamples.creational.abstractFactory.bicycleConveyor.BicycleConveyorFactory;
import org.springExamples.creational.abstractFactory.carConveyor.CarConveyorFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        ConveyorFactory conveyorFactory = context.getBean(CarConveyorFactory.class);
//        ConveyorFactory conveyorFactory = context.getBean(BicycleConveyorFactory.class);

        BodyMaker bodyMaker = conveyorFactory.getBodyMaker();
        WheelsAdder wheelsAdder = conveyorFactory.getWheelsAdder();
        Stuffing stuffing = conveyorFactory.getStuffing();

        bodyMaker.makeBody();
        wheelsAdder.addWheels();
        stuffing.stuff();

        context.close();
    }
}
