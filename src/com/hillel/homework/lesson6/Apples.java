package com.hillel.homework.lesson6;

import com.sun.source.tree.BreakTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apples {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int apple = getApple(READER);
        int bigJar = 5;
        int mediumJar = 3;
        int smallJar = 1;
        int big = printApple(apple, bigJar);
        int medium = printApple(getRemain(apple, big, bigJar), mediumJar);
        int small = printApple(getSmallJar(apple, big, bigJar, medium, mediumJar), smallJar);
        System.out.println("Big =" + big);
        System.out.println("Medium =" + medium);
        System.out.println("Small= " + small);
    }

    private static Integer getApple(BufferedReader READER) throws IOException {
        System.out.println("Enter the number of apples");
        return Integer.parseInt(READER.readLine());
    }

    public static int printApple(int apples, int remain1) {
        int result1 = apples / remain1;
        int result2 = (apples % remain1);
        int a;
        if (result2 > 0) {
            a = result1;
        } else a = result1;
        return a;
    }


    public static int getSmallJar(int apples, int remainForBig, int multiplicityBig, int remainForMedium, int multiplicityMedium) {
        return apples - (remainForBig * multiplicityBig) - (remainForMedium * multiplicityMedium);
    }

    public static int getRemain(int apples, int remain, int multiplicity) {
        return apples - (remain * multiplicity);
    }
}