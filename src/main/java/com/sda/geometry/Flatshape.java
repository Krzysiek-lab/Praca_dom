package com.sda.geometry;

abstract class Flatshape {
    protected double width, height;

    public Flatshape(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public void PrintDimensions() {
        System.out.println(getClass() + " width " + width + " height " + height);
    }

    public void GetArea() {
        System.out.println("Area: " + width * height);
    }
}
