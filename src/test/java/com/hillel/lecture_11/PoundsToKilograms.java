package com.hillel.lecture_11;

public class PoundsToKilograms implements IConverter {
    @Override
    public double convert(double value) {
        double result = value / poundsCoeffiient;
        System.out.println("Converted value = " + result);
        return result;
    }
}
