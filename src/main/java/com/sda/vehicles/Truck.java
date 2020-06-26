package com.sda.vehicles;

public class Truck extends Vehicle {
    public double addPackages() {
        velocity1 -= 10;
        if (velocity1 < 0) {
            return velocity1 + 10;
        }
        return velocity1;
    }

    @Override
    public void run(double velocity1) {
        this.velocity1 = velocity1;
        if (velocity1 <= 80) {
            System.out.println("Vehicle running at speed " + velocity1);
        } else return;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "velocity1=" + velocity1 +
                '}';
    }
}
