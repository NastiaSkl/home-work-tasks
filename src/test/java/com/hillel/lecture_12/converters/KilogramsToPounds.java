package com.hillel.lecture_12.converters;

import com.hillel.lecture_12.IConverter;

public class KilogramsToPounds implements IConverter {

    @Override
    public double convert(double value) throws ConverterCalculationException {
        if(value < 0){
            throw new ConverterCalculationException();
        }
        double result = value * 2.20462;
        System.out.println("Convertion result = " + result);
        return result;
    }
}
