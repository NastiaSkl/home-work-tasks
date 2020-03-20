package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */



public class DistanceConverter {
    public static final double INCHES_KOEFFICIENT = 39.37;

    public static final double MILES_KOEFFICIENT = 1.609;

    @Step
    public double metersToInches(double meters) {
//        TODO implements result
        double result = distanceConverterToInchesMethod(meters);
        return result;
    }

    public static double distanceConverterToInchesMethod(double meters) {
        double result = meters * INCHES_KOEFFICIENT;
        return result;
    }


    @Step
    public double inchesToMeters(double inches) {
//        TODO implements result
        double result = distanceConverterToMetersMethod(inches);
        return result;
    }
    public static double distanceConverterToMetersMethod(double inches) {
        double result = inches / INCHES_KOEFFICIENT;
        return result;
    }



    @Step
    public double milesToKilometres(double miles) {
//        TODO implements result
        double result = distanceConverterToKilometersMethod(miles);
        return result;
    }

    public static double distanceConverterToKilometersMethod(double miles){
        double result = miles * MILES_KOEFFICIENT;
        return result;
    }

    @Step
    public double kilometresToMiles(double kilometres) {
//        TODO implements result
        double result = distanceConverterToMilesMethod(kilometres);
        return result;
    }

    public static double distanceConverterToMilesMethod(double kilometers){
        double result = kilometers / MILES_KOEFFICIENT;
        return result;
    }
}
