package com.hillel.homework.lesson12;

import com.hillel.helper.Helper;

import java.io.IOException;

import static com.hillel.homework.lesson12.Family.getString;

public class FamilyGeneration {
    public static void main(String[] args) throws IOException {
        Helper.print("Enter number of Generation");
        int numberOfGeneration = Integer.parseInt(Family.READER.readLine());
        if (Family.isValid(numberOfGeneration)) return;
        getString(getString(), numberOfGeneration);
    }
}