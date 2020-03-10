package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    @Step
    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result
        String result = " ";
        double D = b * b - 4 * a * c;


        double x1 = (- b + Math.sqrt(D)) / (2d * a);
        double x2 = (- b - Math.sqrt(D)) / (2d * a);

        if (a == 0){
            result = "The 'a' coefficient should not be zero!";
        } else if (D < 0){
            result = "No roots on the set of real numbers!";
        } else if  (D == 0){
            result = "Two real, identical roots: [x1 && x2] = -0.6666666666666666";
        } else {
            result = "Discriminant: " + D + ", " + "x1: " + x1 + ", " + "x2: " + x2;
        }

        return result;
    }

}
