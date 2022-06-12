
package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AbbA {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a sentence or word");
        String input = READER.readLine();
        input=input.replaceAll("\\s+","");
        checkPalindrome(input);
    }

    public static boolean checkPalindrome(String string) {
        for (int i = 0; i < (string.length() / 2); ++i) {
            String s1 = new String(String.valueOf(string.charAt(i)));
            String s2 = new String(String.valueOf(string.charAt(string.length() - i - 1)));
            if (!s1.equalsIgnoreCase(s2)) {
                System.out.println("No, it is not palindrome");
                return false;
            }

        }
        System.out.println("Yes, it is  palindrome");
        return true;
    }
}
