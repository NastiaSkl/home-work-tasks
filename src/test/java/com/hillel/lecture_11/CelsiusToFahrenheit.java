package com.hillel.lecture_11;

public class CelsiusToFahrenheit implements IConverter {


    @Override
    public double convert(double value) {
        double result = (value * 9/5) + 32;
        System.out.println("Converted value = " + result);
        return result;
    }
}
