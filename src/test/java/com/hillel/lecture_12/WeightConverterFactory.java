package com.hillel.lecture_12;

import com.hillel.lecture_12.converters.*;

public class WeightConverterFactory implements IConverterFactory {

    @Override
    public IConverter getConverter(ConverterOperation operation) throws ConverterException {
        switch (operation){
            case KG_TO_POUNDS:
                return new KilogramsToPounds();
            case POUNDS_TO_KG:
                return new PoundsToKilograms();
            default:
                throw new ConverterException();
        }
    }
}
