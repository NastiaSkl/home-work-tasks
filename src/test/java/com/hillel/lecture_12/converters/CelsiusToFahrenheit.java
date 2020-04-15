package com.hillel.lecture_12.converters;

import com.hillel.lecture_12.IConverter;

public class CelsiusToFahrenheit implements IConverter {


    @Override
    public double convert(double value) throws ConverterCalculationException {
        if(value < 0){
            throw new ConverterCalculationException();
        }
        double result = (value * 9/5) + 32;
        System.out.println("Conversion result = " + result);
        return result;

    }
}
