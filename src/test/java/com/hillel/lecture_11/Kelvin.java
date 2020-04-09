package com.hillel.lecture_11;

public class Kelvin implements IConverter {

    @Override
    public double convert(double value) {
        double result = value + kelvinCoefficient;
        System.out.println("Converted value = " + result);
        return result;
    }

}
