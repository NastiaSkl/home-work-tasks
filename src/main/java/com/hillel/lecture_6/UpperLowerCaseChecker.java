package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class UpperLowerCaseChecker {


    @Step
    public String toUpperCase(String word) {

//        TODO implements result
        String result = word.toUpperCase();

        return result;
    }

    @Step
    public String toLowerCase(String word) {

//        TODO implements result
        String result = word.toLowerCase();

        return result;
    }

    @Step
    public String eachSentenceToUpperCase(String sentence) {

//        TODO implements result
        String result = "";
        String [] sentenceArray = sentence.split("[!.]+");

        for (String sen: sentenceArray) {
            String trimSen = sen.trim();
            String tmpStr = trimSen.substring(0,1);
            sentence = sentence.replace(tmpStr + trimSen.substring(1), tmpStr.toUpperCase() + trimSen.substring(1));
        }

        result = sentence;

        return result;
    }

    @Step
    public String eachLetterToUpperCase(String sentence) {

//        TODO implements result
        String result = "";

        String [] sentenceArray = sentence.split("[ ]+");

        for (int i = 0;  i < sentenceArray.length; i++ ){
            Character ch = sentenceArray[i].charAt(0);
            sentenceArray[i] = ch.toString().toUpperCase() + sentenceArray[i].substring(1);
        }
        result =  String.join(" ", sentenceArray);

        return result;
    }
}
