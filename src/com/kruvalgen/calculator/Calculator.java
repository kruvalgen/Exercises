package com.kruvalgen.calculator;

public class Calculator {

    private double firstNumber;
    private double secondNumber;
    private String operator;


    public void calculate() {

        if (operator.equals("+")) {
            System.out.println(" = " + (firstNumber + secondNumber));
        }
        if (operator.equals("-")) {
            System.out.println(" = " + (firstNumber - secondNumber));
        }
        if (operator.equals("*")) {
            System.out.println(" = " + (firstNumber * secondNumber));
        }
        if (operator.equals("/")) {
            System.out.println(" = " + (firstNumber / secondNumber) + (firstNumber % secondNumber));
        }
        if (operator.equals("^")) {
            System.out.println(" = " + Math.pow(firstNumber, secondNumber));

        }

    }
    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

}
