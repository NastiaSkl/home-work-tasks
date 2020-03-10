package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class BelongsToIntervalChecker {

    @Step
    public String checkNumberInInterval(int from, int to, int number) {
        from = -5;
        to = 3;
        String result = "";


        if (number >= from && number <= to) {

            result = "Number " + number + " belong to interval [-5;3]";
        } else {
            result = "Number " + number + " not belong to interval [-5;3]";

        }
        return result;
    }
}


