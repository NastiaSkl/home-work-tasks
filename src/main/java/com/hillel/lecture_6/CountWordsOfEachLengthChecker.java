package com.hillel.lecture_6;

import io.qameta.allure.Step;



/**
 * Created by alpa on 11/2/19
 */
public class CountWordsOfEachLengthChecker {

    @Step
    public int countNumberOfWorldWithLength(String sentence, int wordLength) {

//        TODO implements result
        int result = 0;

        sentence = sentence.replace(",", "").replace(".", "");
        String[] splittedWord = sentence.split(" ");
        int wordCount = 0;

        for (String element:splittedWord) {
            if (element.length() == wordLength) {
                wordCount++;
            }
        }
            result = wordCount;
            return result;
        }
    }

