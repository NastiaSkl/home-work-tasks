package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountLettersFrequenciesChecker {


    @Step
    public String countLettersFrequencies(String text, char letter) {

//        TODO implements result
        String result = "";

        char[] textLettersArray = text.toCharArray();

        int times = 0;

            for (int i = 0; i < textLettersArray.length; i++) {
                if (textLettersArray[i] == letter)
                    times ++;
            }


    result = "Character " + "'" + letter + "'" + " repeated " + times + " times";
    return result;

    }
}
