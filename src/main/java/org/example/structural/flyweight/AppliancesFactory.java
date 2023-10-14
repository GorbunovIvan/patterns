package org.example.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class AppliancesFactory {

    private static final Map<String, Appliances> appliancesMap = new HashMap<>();

    public static Appliances getAppliancesByName(String name) {

        Appliances appliances = appliancesMap.get(name);

        if (appliances == null) {
            switch (name.toLowerCase()) {
                case "fridge" -> {
                    System.out.println("adding fridge");
                    appliances = new Fridge();
                }
                case "washing machine" -> {
                    System.out.println("adding washing machine");
                    appliances = new WashingMachine();
                }
            }
            appliancesMap.put(name, appliances);
        }

        return appliances;
    }
}