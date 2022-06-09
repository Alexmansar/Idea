package com.hillel.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandomValue {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        getMessage();
        int userNumber;
        int randomNumber = (int) (Math.random() * 10);
        do {
            userNumber = getUserNumber();
            check(userNumber);
            if (randomNumber == userNumber) {
                System.out.println("Congratulation");
            } else {
                System.out.println("Try again");
            }
        }
        while (randomNumber != userNumber);

    }

    private static int getUserNumber() throws IOException { //Считываем данные с консоли
        String a = READER.readLine();
        return Integer.parseInt(a);
    }

    public static void check (int a) { //проходим валидацию чисел
        if (a >= 0 && a <= 10) {
            boolean b = true;
        } else System.out.println("You wrong. Value might by 0 to 10");
    }

    public static void getMessage() { //вывод сообщения на консоль
        System.out.println("Hi. Try to guess the number that the computer guessed ");
    }
}