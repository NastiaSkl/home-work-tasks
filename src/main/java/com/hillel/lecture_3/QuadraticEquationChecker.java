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
        double Discriminant = discriminantMethod(a, b, c);


        double x1 = equationCalculationMethod1 (a, b, Discriminant);
        double x2 = equationCalculationMethod2 (a, b, Discriminant);

        if (a == 0){
            result = "The 'a' coefficient should not be zero!";
        } else if (Discriminant < 0){
            result = "No roots on the set of real numbers!";
        } else if  (Discriminant == 0){
            result = "Two real, identical roots: [x1 && x2] = -0.6666666666666666";
        } else {
            result = "Discriminant: " + Discriminant + ", " + "x1: " + x1 + ", " + "x2: " + x2;
        }

        return result;
    }

    public static double discriminantMethod (double a, double b, double c){
        double Discriminant = b * b - 4 * a * c;
        return Discriminant;
    }

    public static double equationCalculationMethod1 (double a, double b, double Discriminant){
        double x1 = (- b + Math.sqrt(Discriminant)) / (2d * a);
        return x1;
    }

    public static double equationCalculationMethod2 (double a, double b, double Discriminant){
        double x2 = (- b - Math.sqrt(Discriminant)) / (2d * a);
        return x2;
    }

}
