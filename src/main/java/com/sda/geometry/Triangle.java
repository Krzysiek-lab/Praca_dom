package com.sda.geometry;

public class Triangle extends Flatshape {
    public Triangle(double width, double height) {
        super(width, height);
    }

    @Override
    public void GetArea() {
        System.out.println("Area: " + (0.5d * width) * height);
    }

    // SPRAWDZENIE
    public static void main(String[] args) {
        Flatshape ob7 = new Triangle(4, 5);
        ob7.PrintDimensions();
        ob7.GetArea();
        Flatshape ob8 = new Rectangle(6, 7);
        ob8.PrintDimensions();
        ob8.GetArea();


        //Triangle as = new Flatshape(2,3);
    }
}
