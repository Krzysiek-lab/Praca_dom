package com.sda.exceptions;

public class ExceptionApp extends DivisionByZeroExcepton {
    public ExceptionApp() {
        super();
    }

    public static void main(String[] args) {
        System.out.println(divide(4, 2));
        //System.out.println(divide(0, 0));
        ExceptionApp inst1 = new ExceptionApp();
        System.out.println(inst1.divide2());
    }
 

    static double divide(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Niewłaściwy argument");
        }
        return x / y;
    }

    double divide2() {
        if (y == 0) {
            throw new DivisionByZeroExcepton();
        }
        return x / y;
    }


}
