package com.hillel.lecture_12;

import com.hillel.lecture_12.converters.CelsiusToFahrenheit;
import com.hillel.lecture_12.converters.CelsiusToKelvin;

public class TemperatureConverterFactory implements IConverterFactory{

    @Override
    public IConverter getConverter(ConverterOperation operation) throws ConverterException {
        switch (operation){
            case CELSIUS_TO_KELVIN:
                return new CelsiusToKelvin();
            case CELSIUS_TO_FAHRENHEIT:
                return new CelsiusToFahrenheit();
            default:
                throw new ConverterException();
        }
    }
}
