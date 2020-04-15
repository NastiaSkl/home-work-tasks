package com.hillel.lecture_12;

public interface IConverterFactory {
    IConverter getConverter(ConverterOperation operation) throws ConverterException;
}
