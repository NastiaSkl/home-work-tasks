package com.hillel.lecture_9;

import io.qameta.allure.Step;

public class PhoneColorIsEqualChecker {

    @Step
    public String phoneColorIsEqual (String phoneColor){
        String result = "";

        if (phoneColor.equals("white")){
            result = "Phone color is the same";
        } else {
            result = "Phone colors are different";
        }

        return result;
    }
}
