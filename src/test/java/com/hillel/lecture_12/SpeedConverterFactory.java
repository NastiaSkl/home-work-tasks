package com.hillel.lecture_12;
import com.hillel.lecture_12.converters.KmToMiles;
import com.hillel.lecture_12.converters.MilesToKm;

public class SpeedConverterFactory implements IConverterFactory {

    @Override
    public IConverter getConverter(ConverterOperation operation) throws ConverterException {
        switch (operation){
            case KM_TO_MI:
                return new KmToMiles();
            case MI_TO_KM:
                return new MilesToKm();
            default:
                throw new ConverterException();
        }
    }

}
