package com.sda.exceptions;

public class DivisionByZeroExcepton extends RuntimeException {
    double x, y;

    public DivisionByZeroExcepton() {
        super("Error when dividing [x] by [y]. Division by zero is forbidden");

      x = 6;
      y = 8;// jak bedzie 0 to wywali wyjatek
    }
}
