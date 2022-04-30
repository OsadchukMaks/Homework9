package com.company.vehicles;

import com.company.professions.Driver;

public class Car {
    private String model;
    private String comfortClass;
    private String weight;
    private Driver driver;
    private Engine engine;

    public Car(String model, String comfortClass, String weight, Driver driver, Engine engine) {
        this.model = model;
        this.comfortClass = comfortClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Go");

    }

    public void stop() {
        System.out.println("Stop");
    }

    public void turnRight() {
        System.out.println("TurnRight");
    }

    public void turnLeft() {
        System.out.println("TurnLeft");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", comfortClass='" + comfortClass + '\'' +
                ", weight='" + weight + '\'' +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
