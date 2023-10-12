package org.example.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Appliances> appliances = new ArrayList<>();

        appliances.add(AppliancesFactory.getAppliancesByName("fridge"));
        appliances.add(AppliancesFactory.getAppliancesByName("fridge"));
        appliances.add(AppliancesFactory.getAppliancesByName("fridge"));
        appliances.add(AppliancesFactory.getAppliancesByName("fridge"));
        appliances.add(AppliancesFactory.getAppliancesByName("fridge"));
        appliances.add(AppliancesFactory.getAppliancesByName("fridge"));
        appliances.add(AppliancesFactory.getAppliancesByName("fridge"));
        appliances.add(AppliancesFactory.getAppliancesByName("fridge"));
        appliances.add(AppliancesFactory.getAppliancesByName("washing machine"));
        appliances.add(AppliancesFactory.getAppliancesByName("washing machine"));
        appliances.add(AppliancesFactory.getAppliancesByName("washing machine"));
        appliances.add(AppliancesFactory.getAppliancesByName("washing machine"));
        appliances.add(AppliancesFactory.getAppliancesByName("washing machine"));
        appliances.add(AppliancesFactory.getAppliancesByName("washing machine"));
        appliances.add(AppliancesFactory.getAppliancesByName("washing machine"));

        appliances.forEach(Appliances::work);

        // Flyweight is a factory that caches once created objects, so it saves memory
        // if we are going to create a lot of objects when we don't depend on their identity.
    }
}