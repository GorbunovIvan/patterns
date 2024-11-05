package org.springExamples.behavioral.visitor;

import org.springExamples.behavioral.visitor.vehicles.Bike;
import org.springExamples.behavioral.visitor.vehicles.Car;
import org.springExamples.behavioral.visitor.vehicles.Truck;
import org.springExamples.behavioral.visitor.vehicles.Vehicle;
import org.springExamples.behavioral.visitor.ways.Way;
import org.springExamples.behavioral.visitor.ways.WayParts;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean("partsOfWay")
    public List<WayParts> partsOfWay(@Qualifier("departure") WayParts departure,
                                     @Qualifier("traversingRoads") WayParts traversingRoads,
                                     @Qualifier("finishing") WayParts finishing) {
        return List.of(departure, traversingRoads, finishing);
    }

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Way way = context.getBean(Way.class);

        Vehicle car = context.getBean(Car.class);
        Vehicle bike = context.getBean(Bike.class);
        Vehicle truck = context.getBean(Truck.class);

        way.passTheWay(car);
        System.out.println("-----");

        way.passTheWay(bike);
        System.out.println("-----");

        way.passTheWay(truck);

        context.close();

        // Represents an operation to be performed on the elements of an object structure.
        // Visitor lets you define a new operation without changing the classes
        // of the elements on which it operates
    }
}
