package com.hillel.lecture_10;

public class EngineerCalculator extends Calculator{

    public void showResult(){
        System.out.println("Hey engineer, your result is " + getResult());
    }

    public double getPiValue(){
        double result = Math.PI;
        setResult(result);
        return result;
    }

    public double getEulersValue(){
        double result = Math.E;
        setResult(result);
        return result;
    }
}
