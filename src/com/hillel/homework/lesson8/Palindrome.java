package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Palindrome {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a sentence or word");
        String input = READER.readLine().replaceAll("\\s+", "");
        System.out.println("It is a palindrome? - " + checkPalindrome(input));
    }

    public static boolean checkPalindrome(String string) {
        for (int i = 0; i < (string.length() / 2); ++i) {
            String string1 = String.valueOf(string.charAt(i));
            String string2 = String.valueOf(string.charAt(string.length() - i - 1));
            if (!string1.equalsIgnoreCase(string2)) {
                return false;
            }
        }
        return true;
    }
}