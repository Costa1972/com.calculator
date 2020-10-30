package com.calculator;

import static com.calculator.ArabicCalculator.*;


import static com.calculator.RomanToArabicConverter.*;
import static com.calculator.ArabicToRomanConverter.*;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static Scanner input;
    static int roman = 1;
    static int arabic = 2;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.println("Выберите систему счисления: \n" + roman + " " +
                "- Римские числа\n" + arabic + " " +
                "- Арабские числа\nНажмите Enter...");
        int selected = input.nextInt();

        while (true) {
            if (selected == 1) {
                System.out.println("Введите аргументы и операцию через пробел: ");
                Scanner scanner = new Scanner(System.in);
                expression = scanner.nextLine();
                Pattern pattern = Pattern.compile(" ");
                String[] operands = pattern.split(expression);

                firstNum = convertRomanToArabic(operands[0]);
                secondNum = convertRomanToArabic(operands[2]);
                operation = operands[1];
                switch (operation){
                    case "+":
                        System.out.println(firstNum + " " + operation + " " + secondNum + " = " + convertArabicToRoman(sum(firstNum, secondNum)));
                        break;
                    case "-":
                        System.out.println(firstNum + " " + operation + " " + secondNum + " = " + convertArabicToRoman(subtraction(firstNum, secondNum)));
                        break;
                    case "*":
                        System.out.println(firstNum + " " + operation + " " + secondNum + " = " + convertArabicToRoman(multiplication(firstNum, secondNum)));
                        break;
                    case "/":
                        System.out.println(firstNum + " " + operation + " " + secondNum + " = " + convertArabicToRoman(division(firstNum, secondNum)));
                        break;
                    default:
                        System.out.println("Что-то пошло не так. Попробуйте еще раз.");

                }

            } else if (selected == 2) {
                System.out.println("Введите аргументы и операцию через пробел: ");
                Scanner arabicInput = new Scanner(System.in);
                expression = arabicInput.nextLine();
                String[] operands = expression.split("\\s*");
                firstNum = Integer.parseInt(operands[0]);
                secondNum = Integer.parseInt(operands[2]);
                operation = operands[1];
                switch (operation) {
                    case "+":
                        System.out.println(firstNum + " " + operation + " " + secondNum + " = " + sum(firstNum, secondNum));
                        break;
                    case "-":
                        System.out.println(firstNum + " " + operation + " " + secondNum + " = " + subtraction(firstNum, secondNum));
                        break;
                    case "*":
                        System.out.println(firstNum + " " + operation + " " + secondNum + " = " + multiplication(firstNum, secondNum));
                        break;
                    case "/":
                        if (secondNum == 0) {
                            System.out.println("На ноль делить нельзя!!!");
                        } else {
                            System.out.println(firstNum + " " + operation + " " + secondNum + " = " + String.format("%.2f", division(firstNum, secondNum)));
                        }
                }
            } else {
                System.out.println("Неправильный ввод.");
            }


        }

    }
}
