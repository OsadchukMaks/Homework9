package com.company.vehicles;

public class Engine {
    private int perfomance;
    private int сapacity;

    public Engine(int perfomance, int сapacity) {
        this.perfomance = perfomance;
        this.сapacity = сapacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "perfomance=" + perfomance +
                ", сapacity=" + сapacity +
                '}';
    }
}
