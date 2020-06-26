package com.sda.geometry;

public class Rectangle extends Flatshape {
    public Rectangle(double width, double height) {
        super(width, height);
    }
    @Override
    public void GetArea() {
        System.out.println("Area: " + width * height);
    }
}
