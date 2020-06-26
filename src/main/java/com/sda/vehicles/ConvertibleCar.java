package com.sda.vehicles;

public class ConvertibleCar extends Car {
    boolean sunDoor;

    ConvertibleCar(double velocity1, int passengers, boolean sunDoor) {
        super(velocity1, passengers);
        this.sunDoor = sunDoor;
    }

    boolean openRoof() {
        if (sunDoor) {
            System.out.println("Sunroof is open");
        } else System.out.println("Sunroof is closed");
        return sunDoor;
    }

    void closeRoof() {
        if (sunDoor) {
            System.out.println("Sunroof is alredy open");
        } else System.out.println("Sunroof is alredy closed");
    }
}
