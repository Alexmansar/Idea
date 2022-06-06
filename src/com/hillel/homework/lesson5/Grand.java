package com.hillel.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grand {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter math grade : ");
        Integer gradeMath = getGrade(reader);
        if (getMessage(gradeMath)) return;
        System.out.println("Enter physics grade : ");
        Integer gradePhysics = getGrade(reader);
        if (getMessage(gradePhysics)) return;
        System.out.println("Enter chemistry grade : ");
        Integer gradeChemistry = getGrade(reader);
        if (getMessage(gradeChemistry)) return;
        System.out.println("Enter geography grade : ");
        Integer gradeGeography = getGrade(reader);
        if (getMessage(gradeGeography)) return;
        System.out.println("Enter biology grade: ");
        Integer gradeBiology = getGrade(reader);
        if (getMessage(gradeBiology)) return;
        System.out.println("Grade math:" + gradeMath);
        System.out.println("Grade physics:" + gradePhysics);
        System.out.println("Grade chemistry:" + gradeChemistry);
        System.out.println("Grade geography:" + gradeGeography);
        System.out.println("Grade biology:" + gradeBiology);
        float averageRating = getAverageRating(gradeMath, gradePhysics, gradeChemistry, gradeGeography, gradeBiology);
        System.out.println("Average rating is= :" + averageRating);
        printMessageGrade(averageRating, 8, 10);
    }

    private static boolean getMessage(Integer grade) {
        if (grade <= 0 || grade > 12) {
            System.out.println("Grade was entered incorrectly, please resend. Valid value from 0 to 12. Thank you!");
            return true;
        }
        return false;
    }

    private static void printMessageGrade(float averageRating, int min, int max) {
        if (averageRating >= max) {// && averageRating <= intermediateVar1) {
            System.out.println("Congratulation, you get a presidential grand!");
            //System.out.println("You don't get a grand");
        } else if (averageRating <= min) {// && averageRating <= intermediateVar2) {
            //System.out.println("You get a grand");
            System.out.println("You don't get a grand");
            //} else if (averageRating > intermediateVar2 && averageRating <= max) {
            //  System.out.println("Congratulation, you get a presidential grand!");
        } else
            System.out.println("You get a grand");
        //System.out.println("Check the correctness of entering grades!");
    }

    private static float getAverageRating(int gradeMath, int gradePhysics, int gradeChemistry, int gradeGeography,
                                          int gradeBiology) {
        int numberLesson = 5;
        return (float) (gradeMath + gradePhysics + gradeChemistry + gradeGeography + gradeBiology) / numberLesson;
    }

    private static Integer getGrade(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }
}