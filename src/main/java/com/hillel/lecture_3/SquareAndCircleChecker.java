package com.hillel.lecture_3;

import io.qameta.allure.Step;


/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {

    @Step
    public String checkCircleInSquare(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";
        double r = (Math.sqrt(circleArea/Math.PI));
        double squareSide = Math.sqrt(squareArea);
        double d = 2 * r;

        if (squareSide >= d){
            result = "The circle is in the square";
        } else {
            result = "The circle is not in the square";
        }


        return result;
    }

    @Step
    public String checkSquareInCircle(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";
        double squareDiag = Math.sqrt(2 * squareArea);
        double r = (Math.sqrt(circleArea/Math.PI));
        double d = 2 * r;

        if (squareDiag <= d){
            result = "The square is in the circle";
        } else {
            result = "The square is not in the circle";
        }


        return result;
    }

}
