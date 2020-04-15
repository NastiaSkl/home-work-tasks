package com.hillel.lecture_12;

import com.hillel.lecture_12.converters.ConverterCalculationException;


public class Main {

    public static void main(String[] args) throws ConverterCalculationException, ConverterException {
        IConverterFactory converterFactory = ConvertersFactory.create(ConverterType.WEIGHT);
        IConverter converter = converterFactory.getConverter(ConverterOperation.KG_TO_POUNDS);
        double result = converter.convert(10);
        double result2 = converter.convert(-10); //Converter calculation exception should occur here


        IConverter converter1 = converterFactory.getConverter(ConverterOperation.CELSIUS_TO_FAHRENHEIT); // Converter exception should occur here
    }
}
