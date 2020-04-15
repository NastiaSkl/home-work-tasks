package com.hillel.lecture_12;

import com.hillel.lecture_12.converters.ConverterCalculationException;

public interface IConverter {

    double convert (double value) throws ConverterCalculationException;

}
