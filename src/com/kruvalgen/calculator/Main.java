package com.kruvalgen.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//написать консольный калькулятор который поддерживает операции (+ - * / =  ^(возвести в квадрат))
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Calculator calculator = new Calculator();

        System.out.println("Enter first number: ");
        calculator.setFirstNumber(Integer.parseInt(getOperator(reader)));
        System.out.println("Enter operator: ");
        calculator.setOperator(getOperator(reader));

        if(calculator.getOperator().equals("^")){
            System.out.println("Enter the degree");
        }else{
            System.out.println("Enter second number: ");
        }
        calculator.setSecondNumber(Integer.parseInt(getOperator(reader)));

        calculator.calculate();
    }

    private static String getOperator(BufferedReader reader) throws IOException {
        return reader.readLine();
    }
}
