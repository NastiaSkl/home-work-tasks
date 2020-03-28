package com.hillel.lecture_8;


public class FractionNumbers {

    int numerator = 2;
    int denominator = 3;


    public String multiply(int numerator, int denominator) {
        int numeratorFinal = this.numerator * numerator;
        int demonitatorFinal = this.denominator * denominator;
        String result = "Result = " + numeratorFinal + "/" + demonitatorFinal;
        return result;
    }

    public String divide(int numerator, int denominator) {
        int numeratorFinal = this.numerator * denominator;
        int denominatorFinal = this.denominator * numerator;
        String result = "Result = " + numeratorFinal + "/" + denominatorFinal;
        return result;
    }

    public String plus(int numerator, int denominator) {
            int numeratorFinal = ((this.numerator * denominator) + (this.denominator * numerator));
            int denominatorFinal = (this.denominator * denominator);
            String result = "Result = " + numeratorFinal + "/" + denominatorFinal;
            return result;

        }

    public String minus(int numerator, int denominator) {
        int numeratorFinal = ((this.numerator * denominator) - (this.denominator * numerator));
        int denominatorFinal = (this.denominator * denominator);
        String result = "Result = " + numeratorFinal + "/" + denominatorFinal;
        return result;

    }

    }

