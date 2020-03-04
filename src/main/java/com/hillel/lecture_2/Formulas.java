package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    @Step
    public double calculate9Formula(double x) {
        double e = Math.E;
        double pi = Math.PI;
        double result = 1.1*Math.exp(-x) + Math.abs(Math.cos(Math.sqrt(pi*x))) - (double)3/8;
//        TODO implement formula 9
        return result;
    }

    @Step
    public double calculate10Formula(double x) {
        //double sqrt = Math.sqrt(Math.abs(Math.sin(x)));
        //double degree = 0.12 * x;
        //double multiplier1 = Math.exp(degree);
        //double cbrt = Math.cbrt(multiplier1);
        //double result = (1d * sqrt * cbrt)/3d ;
//        TODO implement formula 10

        double result = 1d/3d*Math.sqrt(Math.abs(Math.sin(x)))*Math.cbrt(Math.exp(0.12*x));
        return result;
    }

    @Step
    public double calculate11Formula(double x) {
        double pi = Math.PI;
        double multiplier1 = Math.abs(Math.sin(Math.sqrt(10.5*x)));
        double multiplier2 = Math.cbrt(Math.pow(x, 2)) + (double)1/7;
        double multiplier3 = (double)1 / multiplier2;
        double result = (2*pi*x) - (multiplier1 * multiplier3);
//        TODO implement formula 11
        return result;
    }

    @Step
    public double calculate12Formula(double x) {
        double e = Math.E;
        double sqrt = Math.sqrt(Math.abs((double)2 - x));
        double divider = (double)2 + Math.pow(e, -x);
        double cbrt = Math.cbrt((double)2/x);
        double result = (Math.log((sqrt + 1.2)) * (double)1/divider) + cbrt;
//        TODO implement formula 12
        return result;
    }

    @Step
    public double calculate13Formula(double x) {


        double e = Math.E;
        double a = -2.0 + x;
        double b =  Math.pow(Math.exp(a), 1.0/(double)5);
        double c = Math.abs(x - 3.14);
        double divider =  Math.sqrt(Math.pow(x, 2.0) + Math.pow(x, 4.0) + Math.log(c));
        double result =  b/divider;
        //        TODO implement formula 13
        return result;
    }

    @Step
    public double calculate17Formula(double x) {
        double a = Math.pow(x, 3)/(double)3;
        double b = Math.exp(x);
        double c = Math.log(Math.abs(Math.pow(1.3, 3) + Math.pow(x, 3)));
        double d = (double)4/3;

        double result = (a - (b *c)) + d;
        //        TODO implement formula 17
        return result;
    }

    @Step
    public double calculate26Formula(double x) {
        double a = Math.log(Math.sin(x));
        double b = (double)2 * Math.exp(x);
        double c = (double)2 * Math.cos(Math.abs(x));
        double result = a + b + c + (double)2;
        //        TODO implement formula 26
        return result;
    }
}
