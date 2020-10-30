package com.calculator;

import java.util.Scanner;

public class ArabicCalculator {
    static String expression;
    static String first;
    static String operation;
    static String second;
    static int firstNum;
    static int secondNum;



    static int sum(int a, int b) {
        return a + b;
    }

    static int subtraction(int a, int b) {
        return a - b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static int division(int a, int b) {
        return a / b;
    }
}
