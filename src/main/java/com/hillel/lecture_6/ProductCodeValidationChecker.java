package com.hillel.lecture_6;


import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {

//        TODO implements result
        boolean isValid = false;

        String[] splittedCode = code.split(" ");
        String fistPart = splittedCode[0];
        String secondPart = splittedCode[1];
        String digits = fistPart.replaceAll("\\D+","");
        String letters = fistPart.replaceAll("\\d","");

        String pair1 = digits.substring(0,2);
        String pair2 = digits.substring(2,4);
        String pair3 = digits.substring(4,6);

        int a = Integer.parseInt(pair1);
        int b = Integer.parseInt(pair2);
        int c = Integer.parseInt(pair3);
        int d = Integer.parseInt(secondPart);

        if (letters.toUpperCase() != letters){
            isValid = false;
        } else if (a*b*c == d){
            isValid = true;
        }



        return isValid;
    }
}
