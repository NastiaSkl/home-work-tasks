package com.hillel.lecture_4;

import io.qameta.allure.Step;

import java.util.Dictionary;

/**
 * Created by alpa on 10/25/19
 */
public class DecimalToHexadecimalChecker {

    @Step
    public String fromDecimalToHexadecimal(int value) {

//        TODO implements result
        String result = "";

        while (true){
            result = Integer.toHexString(value%16).toUpperCase() + result;
            value /= 16;
            if (value <= 15){
                result = Integer.toHexString(value).toUpperCase() + result;
                break;
            }
        }
        return result;
    }

    @Step
    public int fromHexadecimalToDecimal(String value) {

//        TODO implements result
        int result = 0;

        for (int i = 0; i < value.length();) {
            Character ch = value.charAt(i);
            int n = Integer.parseInt(ch.toString(), 16);
            i++;
            double k = Math.pow(16, value.length()-i);
            result += n * k;
        }

        return result;
    }
}
