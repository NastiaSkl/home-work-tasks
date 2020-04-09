package com.hillel.lecture_11;

public class FarenheitToCelcius implements IConverter {

    @Override
    public double convert(double value) {
        double result = (value - 32) * 5/9;
        System.out.println("Converted value = " + result);
        return result;
    }
}
