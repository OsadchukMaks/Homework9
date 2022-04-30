package com.company.vehicles;

import com.company.professions.Driver;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String model, String comfortClass, String weight,
                    Driver driver, Engine engine, int maxSpeed) {
        super(model, comfortClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }
}
