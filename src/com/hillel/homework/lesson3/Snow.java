package com.hillel.homework.lesson3;

public class Snow {
    public static void main(String[] args) {

        float x = 0.2f;
        float r1 = x;
        float r2 = 2.5f * x;
        float r3 = 5 * x;
        float p = 0.7f;
        // вариант 1
        float m1 = (float) (p * ((float) 4 / 3 * Math.PI * (Math.pow(r1, 3) + Math.pow(r2, 3) + Math.pow(r3, 3))));
        System.out.println("m1=" + m1 + "kg");
        // вариант 2
        float v1 = (float) (((float) 4 / 3 * Math.PI * Math.pow(r1, 3)));
        float v2 = (float) ((float) 4 / 3 * Math.PI * Math.pow(r2, 3));
        float v3 = (float) ((float) 4 / 3 * Math.PI * Math.pow(r3, 3));
        float m2 = p * (v1 + v2 + v3);
        System.out.println("m2=" + m2 + "kg");

    }
}


