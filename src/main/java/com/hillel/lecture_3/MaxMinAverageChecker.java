package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MaxMinAverageChecker {

    @Step
    public int getMaxNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        if (c - (a + b) > 0){
            result = c;
        }

        return result;
    }

    @Step
    public int getAverageNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        if (a < b && b < c){
            result = b;
        }

        return result;
    }

    @Step
    public int getMinNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        if (a > b && a > c) {
            result = a;
        }

        return result;
    }

    @Step
    public int getThanAllNumberShouldNotBeEquals(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        if (a == b && b == c && a == c) {
            result = result;
        }

        return result;
    }

}
