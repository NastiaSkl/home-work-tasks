package com.hillel.lecture_12;


public class ConverterException extends Exception{

    @Override
    public String getMessage() {
        return "Conversion Exception. Selected conversion type is incorrect";
    }
}
