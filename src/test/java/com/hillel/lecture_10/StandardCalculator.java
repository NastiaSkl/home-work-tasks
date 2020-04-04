package com.hillel.lecture_10;

public class StandardCalculator extends Calculator {


    @Override
    public void showResult(){
        System.out.println("Result = " + getResult());
    }


    public double squareRootMethod(double a){
      setA(a);
      double result = Math.sqrt(getA());
      setResult(result);
      return result;
    }

    public double degreeMethod(double a, int degree){
        setA(a);
        double result = Math.pow(a, degree);
        setResult(result);
        return result;
    }


}
