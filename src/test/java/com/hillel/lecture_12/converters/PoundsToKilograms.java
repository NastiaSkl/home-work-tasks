package com.hillel.lecture_12.converters;

import com.hillel.lecture_12.IConverter;

public class PoundsToKilograms implements IConverter {

    @Override
    public double convert(double value) throws ConverterCalculationException {
        if(value < 0){
            throw new ConverterCalculationException();
        }
        double result = value / 2.2046;
        System.out.println("Conversion result = " + result);
        return result;
    }
}
