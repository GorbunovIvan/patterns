package org.springExamples.structural.flyweight;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
public class SpringConfig {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        List<Appliances> appliances = new ArrayList<>();

        appliances.add(context.getBean("fridge", Appliances.class));
        appliances.add(context.getBean("fridge", Appliances.class));
        appliances.add(context.getBean("fridge", Appliances.class));
        appliances.add(context.getBean("fridge", Appliances.class));
        appliances.add(context.getBean("fridge", Appliances.class));
        appliances.add(context.getBean("fridge", Appliances.class));
        appliances.add(context.getBean("fridge", Appliances.class));
        appliances.add(context.getBean("fridge", Appliances.class));
        appliances.add(context.getBean("washing machine", Appliances.class));
        appliances.add(context.getBean("washing machine", Appliances.class));
        appliances.add(context.getBean("washing machine", Appliances.class));
        appliances.add(context.getBean("washing machine", Appliances.class));
        appliances.add(context.getBean("washing machine", Appliances.class));
        appliances.add(context.getBean("washing machine", Appliances.class));
        appliances.add(context.getBean("washing machine", Appliances.class));

        appliances.forEach(Appliances::work);

        context.close();
        
        // Flyweight is a factory that caches once created objects, so it saves memory
        // if we are going to create a lot of objects when we don't depend on their identity.
    }
}