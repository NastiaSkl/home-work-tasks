package com.hillel.lecture_12.converters;

import com.hillel.lecture_12.IConverter;

public class MilesToKilometers implements IConverter {

    public static final double SPEED_COEFFICIENT = 1.6092693916961700;

    @Override
    public double convert(double value) throws ConverterCalculationException {
        if(value < 0){
            throw new ConverterCalculationException();
        }
        double result = value * SPEED_COEFFICIENT;
        System.out.println("Conversion result = " + result);
        return result;
    }
}
