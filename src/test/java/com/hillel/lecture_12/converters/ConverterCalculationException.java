package com.hillel.lecture_12.converters;

public class ConverterCalculationException extends Exception {

    @Override
    public String getMessage() {
        return "Value is below 0. Please Enter a different value";
    }
}
