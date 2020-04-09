package com.hillel.lecture_11;

public class KmToMi implements IConverter {
    @Override
    public double convert(double value) {
        double result = value / speedCoefficient;
        System.out.println("Converted value = " + result);
        return result;
    }
}
