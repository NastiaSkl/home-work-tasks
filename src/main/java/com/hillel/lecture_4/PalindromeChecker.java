package com.hillel.lecture_4;

import io.qameta.allure.Step;


/**
 * Created by alpa on 10/25/19
 */
public class PalindromeChecker {

    @Step
    public boolean isPalindrome(String value) {

//        TODO implements result
        boolean result = false;

        char[] array = value.toCharArray();

        for (int i = 0, j = array.length-1; i < array.length; i++, j--){
            Character ch1 = array[i];
            Character ch2 = array[j];
            if (ch1 == ch2){
                if (i == j)
                  result  = true;
                continue;
            }
            break;
        }

        return result;
    }

}
