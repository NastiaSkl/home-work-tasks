package com.hillel.lecture_10;

public abstract class Calculator {

    private double a;
    private double b;
    private double result;

    public abstract void showResult();


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result){
        this.result = result;
    }

    public double plusMethod (double a, double b){
        result = a + b;
        return result;
    }


    public double minusMethod (double a, double b){
        result = a - b;
        return result;
    }

    public double multiplyMethod (double a, double b){
        result = a * b;
        return result;
    }

    public double divideMethod (double a, double b){
        result = a / b;
        return result;
    }
}
