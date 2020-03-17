package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class FibonacciNumbersChecker {

    @Step
    public int[] getFibonacciNumbers(int number) {

//        TODO implements result
        int[] result = new int[number];

        int n0 = 1;
        int n1 = 1;
        int n2;
        result[0] = 0;
        result[1] = n0;
        result[2] = n1;
        for(int i = 3; i < number; i++){
            n2=n0+n1;
            result[i] = n2;
            n0=n1;
            n1=n2;
        }

        return result;
    }

}
