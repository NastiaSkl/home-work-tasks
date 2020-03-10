package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MagnitudeChecker {

    @Step
    public String getGreatestNumberByMagnitude(double a, double b) {
//        TODO implements result
        String result = "";
        if (b - a > 0) {
            result = "The number " + b + " has the greatest magnitude!";
        } else if (b + a == 0) {
            result = "The number " + a + " and " + b + " are equals by magnitude!";
        } else if (b + a < 0){
            result = "The number " + b + " has the greatest magnitude!";
        }

        return result;
    }
}
