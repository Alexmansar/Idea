package com.hillel.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculate {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        Double number1 = getVolue(READER);
        char operation = getOperation();
        Double number2 = getVolue(READER);
        double result = culculate(number1, number2, operation);
        System.out.println("Result= " + result);
    }

    public static Double getVolue(BufferedReader READER) throws IOException {
        System.out.println("Enter number ");
        return Double.parseDouble(READER.readLine());
    }

    public static char getOperation() {
        char operation;
        System.out.println("Enter operation ");
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            scanner.next();
            operation = getOperation();
        }

        return operation;
    }

    public static double culculate(double number1, double number2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Error");
                result = culculate(number1, number2, getOperation());
        }
        return result;
    }
}
