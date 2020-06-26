package com.sda.vehicles;

public class Car extends Vehicle {
    int passengers;

    Car(double velocity1, int passengers) {
        super(velocity1);
        this.passengers = passengers;

    }

    public void addPassenger() {
        if (passengers < 0) {
            ++passengers;
            System.out.println("Added number of  passengers: " + passengers);
        } else if (passengers > 4) {
            System.out.println("Number of passengers too big");
            return;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "passengers=" + passengers +
                '}';
    }

    public void removePassenger() {
        if (passengers > 4) {
            --passengers;
            System.out.println("Number of  passengers after removal: " + passengers);
        } else if (passengers < 0) {
            System.out.println("Number of passengers o small");
            return;
        }

    }
}
