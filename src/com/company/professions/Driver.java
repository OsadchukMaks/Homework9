package com.company.professions;

public class Driver extends Person {
    private int expirienceDrive;

    public Driver(String firstName, String lastName, String middleName, int expirienceDrive) {
        super(firstName, lastName, middleName);
        this.expirienceDrive = expirienceDrive;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "expirienceDrive=" + expirienceDrive +
                '}';
    }
}
