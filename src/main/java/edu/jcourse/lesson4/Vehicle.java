package edu.jcourse.lesson4;

class Vehicle {
    String name;
    int passengers;
    int tank;
    float fuelPer100km;

    public Vehicle() {
    }

    public Vehicle(String name, int passengers, int tank, float fuelPer100km) {
        this.name = name;
        this.passengers = passengers;
        this.tank = tank;
        this.fuelPer100km = fuelPer100km;
    }
}

