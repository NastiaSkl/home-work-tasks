package com.hillel.lecture_10;

public class Main {

    public static void main(String[] args) {
        StandardCalculator standardCalculator = new StandardCalculator();
        standardCalculator.minusMethod(4, 5);
        standardCalculator.showResult();
        standardCalculator.squareRootMethod(25);
        standardCalculator.showResult();
        standardCalculator.divideMethod(81, 9);
        standardCalculator.showResult();
        standardCalculator.degreeMethod(5, 3);
        standardCalculator.showResult();

        EngineerCalculator engineerCalculator = new EngineerCalculator();
        engineerCalculator.getPiValue();
        engineerCalculator.showResult();
        engineerCalculator.getEulersValue();
        engineerCalculator.showResult();
        engineerCalculator.plusMethod(125.11, 225.89);
        engineerCalculator.showResult();
        engineerCalculator.multiplyMethod(5, 1.5);
        engineerCalculator.showResult();




    }
}
