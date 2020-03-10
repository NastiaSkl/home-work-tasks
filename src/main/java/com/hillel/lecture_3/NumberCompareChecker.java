package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class NumberCompareChecker {

    @Step
    public String getGreatestNumber(int a, int b) {

//        TODO implements result
        String result = "";

        if (b - a > 0){
            result = "Number " + b + " has greatest value!";
        } else if (b - a < 0){
            result = "Number " + a + " has greatest value!";
        } else if ( b == a){
            result = "Numbers " + a + " and " + b + " are equals!";
        }
        return result;
    }
}
