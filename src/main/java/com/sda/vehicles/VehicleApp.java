package com.sda.vehicles;

public class VehicleApp {
    public static void main(String[] args) {
        // ZAD. 3.3-3.6
        Vehicle obiekt4 = new Vehicle();
        obiekt4.run(100);
        System.out.println();
        Car obiekt5 = new Car(200, 50);
        obiekt5.addPassenger();
        obiekt5.removePassenger();
        System.out.println();
        ConvertibleCar obiekt6 = new ConvertibleCar(150, -1, true);
        obiekt6.openRoof();
        obiekt6.closeRoof();
        obiekt6.addPassenger();
        obiekt6.removePassenger();
        System.out.println();
        ConvertibleCar obiekt7 = new ConvertibleCar(200, 5, false);
        obiekt7.openRoof();
        obiekt7.closeRoof();
        obiekt7.addPassenger();
        obiekt7.removePassenger();
        System.out.println();
        Vehicle obiekt8 = new Vehicle(300);
        System.out.println(obiekt7.toString());
        System.out.println(obiekt8.toString());
        System.out.println();
        Truck obiekt9 = new Truck();
        obiekt9.run(70);
        System.out.println(obiekt9.toString());
        System.out.println();


    }
}
