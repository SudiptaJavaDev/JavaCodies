package com.core;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double num1 = scanner.nextInt();
        double num2 = scanner.nextInt();
        double result;
        System.out.println("Enter operator (+, -, *, /, %)");
        char operator = scanner.next().trim().charAt(0);
        switch (operator) {
            case '+' -> {
                result = num1 + num2;
                System.out.println("Sum of " + num1 + " and " + num2 + " is " + result);
            }
            case '-' -> {
                result = num1 - num2;
                System.out.println("Difference of " + num1 + " and " + num2 + " is " + result);
            }
            case '*' -> {
                result = num1 * num2;
                System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + result);
            }
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division of " + num1 + " and " + num2 + " is " + result);
                } else {
                    System.out.println("Cannot divide by zero");
                }
            }
            case '%' -> {
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Remainder of " + num1 + " and " + num2 + " is " + result);
                } else {
                    System.out.println("Cannot mod by zero");
                }
            }
            default -> System.out.println("Invalid operator");
        }
    }

}
