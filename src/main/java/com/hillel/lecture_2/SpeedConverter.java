package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class SpeedConverter {

public static final double SPEED_KOEFFICIENT = 1.6092693916961700;

    @Step
    public double speedKmToMi(double speedKm) {
//        TODO implements result
        double result = speedConverterToMilesMethod(speedKm);
        return result;
    }

    public static double speedConverterToMilesMethod (double speedKm){
        double result = speedKm / SPEED_KOEFFICIENT;
        return result;
    }

    @Step
    public double speedMiToKm(double speedMi) {
//        TODO implements result
        double result = speedConverterToKmMethod(speedMi);
        return result;
    }
    public static double speedConverterToKmMethod (double speedMi){
        double result = speedMi * SPEED_KOEFFICIENT;
        return result;
    }

}
