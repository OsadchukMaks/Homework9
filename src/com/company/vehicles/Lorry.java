package com.company.vehicles;

import com.company.professions.Driver;

public class Lorry extends Car {
    private int loadCapacity;

    public Lorry(String model, String comfortClass, String weight,
                 Driver driver, Engine engine, int loadCapacity) {
        super(model, comfortClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }
}
