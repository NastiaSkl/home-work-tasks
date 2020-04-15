package com.hillel.lecture_12;


import com.hillel.lecture_12.converters.*;

public class DistanceConverterFactory implements IConverterFactory {

    @Override
    public IConverter getConverter(ConverterOperation operation) throws ConverterException {
        switch (operation){
            case MILES_TO_KILOMETERS:
                return new MilesToKilometers();
            case KILOMETERS_TO_MILES:
                return new KilometersToMiles();
            case METERS_TO_INCHES:
                return new MetersToInches();
            case INCHES_TO_METERS:
                return new InchesToMeters();
            default:
                throw new ConverterException();
        }
    }
}
