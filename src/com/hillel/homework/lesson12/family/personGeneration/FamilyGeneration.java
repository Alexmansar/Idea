package com.hillel.homework.lesson12.family.personGeneration;

import com.hillel.helper.Helper;
import com.hillel.homework.lesson12.family.personGeneration.Person;

import java.io.IOException;

import static com.hillel.homework.lesson12.family.personGeneration.Person.getString;


public class FamilyGeneration {
    public static void main(String[] args) throws IOException {
        Helper.print("Enter number of Generation");
        int numberOfGeneration = Integer.parseInt(Person.READER.readLine());
        if (Person.isValid(numberOfGeneration)) return;
        getString(getString(), numberOfGeneration);
    }
}
