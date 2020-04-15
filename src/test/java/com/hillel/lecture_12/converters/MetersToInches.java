package com.hillel.lecture_12.converters;

import com.hillel.lecture_12.IConverter;

public class MetersToInches implements IConverter {

    public static final double INCHES_COEFFICIENT = 39.37;


    @Override
    public double convert(double value) throws ConverterCalculationException {
        if(value < 0){
            throw new ConverterCalculationException();
        }
        double result = value * INCHES_COEFFICIENT;
        System.out.println("Conversion result = " + result);
        return result;
    }
}
