package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class TwoArrays {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] strings = new String[20];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = READER.readLine();
        }

        String[] firstArray = Arrays.copyOfRange(strings, 0, strings.length / 2);
        String[] secondArray = Arrays.copyOfRange(strings, strings.length / 2, strings.length);
        System.out.println("First array is "+Arrays.toString(firstArray));
        System.out.println("Second array is "+Arrays.toString(secondArray));

    }

}