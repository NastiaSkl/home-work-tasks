package com.hillel.lecture_12;

public class ConvertersFactory {
    public static IConverterFactory create(ConverterType type){
        switch (type){
            case WEIGHT:
                return new WeightConverterFactory();
            case DISTANCE:
                return new DistanceConverterFactory();
            case TEMPERATURE:
                return new TemperatureConverterFactory();
            case SPEED:
                return new SpeedConverterFactory();
        }
        return null;
    }
}
