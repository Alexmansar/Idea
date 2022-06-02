package com.hillel.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grand {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter math grade : ");
        int gradeMath = Integer.parseInt(reader.readLine());
        System.out.println("Enter physics grade : ");
        int gradePhysics = Integer.parseInt(reader.readLine());
        System.out.println("Enter chemistry grade : ");
        int gradeChemistry = Integer.parseInt(reader.readLine());
        System.out.println("Enter geography grade : ");
        int gradeGeography = Integer.parseInt(reader.readLine());
        System.out.println("Enter biology grade: ");
        int gradeBiology = Integer.parseInt(reader.readLine());
        System.out.println("Grade math:" + gradeMath);
        System.out.println("Grade physics:" + gradePhysics);
        System.out.println("Grade chemistry:" + gradeChemistry);
        System.out.println("Grade geography:" + gradeGeography);
        System.out.println("Grade biology:" + gradeBiology);
        int numberLesson = 5;
        float averageRating = (float) (gradeMath + gradePhysics + gradeChemistry + gradeGeography + gradeBiology) / numberLesson;
        System.out.println("Average rating = " + averageRating);

        if (averageRating >= 0 && averageRating <= 8) {
            System.out.println("You don't get a grand");

        } else if (averageRating > 8 && averageRating <= 10) {
            System.out.println("You get a grand");
        } else if (averageRating > 10 && averageRating <= 12) {
            System.out.println("Congratulation, you get a presidential grand!");
        } else
            System.out.println("Check the correctness of entering grades!");
    }

}
