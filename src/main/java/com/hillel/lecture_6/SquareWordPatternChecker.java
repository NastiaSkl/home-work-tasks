package com.hillel.lecture_6;

import io.qameta.allure.Step;
import sun.plugin.net.protocol.jar.CachedJarURLConnection;

/**
 * Created by alpa on 11/2/19
 */
public class SquareWordPatternChecker {


    @Step
    public String applySquareWordPattern(String word) {

//        TODO implements result
        String result = "";
        int count = word.length();
        String changedWord = word;

        String[] array = new String[count];
        array[0] = changedWord;
        for (int i = 1; i < word.length(); i++ ) {
            Character letter = changedWord.charAt(0);
            changedWord = changedWord.substring(1) + letter;

            array[i] = changedWord;
        }
         result = String.join(", ", array);
         return result;
    }


}
