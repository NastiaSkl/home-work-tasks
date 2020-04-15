package com.hillel.lecture_12.converters;

import com.hillel.lecture_12.IConverter;

public class MilesToKm implements IConverter {

    public static final double MILES_COEFFICIENT = 1.609;


    @Override
    public double convert(double value) throws ConverterCalculationException {
        if(value < 0){
            throw new ConverterCalculationException();
        }
        double result = value * MILES_COEFFICIENT;
        System.out.println("Conversion result = " + result);
        return result;
    }
}
