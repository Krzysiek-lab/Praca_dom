package com.sda.vehicles;

public class Vehicle {
    double velocity1 = 0;

    public Vehicle() {

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "velocity1=" + velocity1 +
                '}';
    }

    public Vehicle(double velocity1) {
        this.velocity1 = velocity1;

    }


    public void run(double velocity2) {
        System.out.println("Vehicle running at speed " + velocity2);

    }
}
