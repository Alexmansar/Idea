package com.hillel.homework.lesson12;

import com.hillel.Helper.Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FamilyCreate {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Helper.print("Enter child name");
        String childName = Helper.getString();
        Helper.print("Enter mother name");
        String motherName = Helper.getString();
        Helper.print("Enter father name");
        String fatherName = Helper.getString();
        Family child = new Family(childName);
        Family mother = new Family(motherName);
        Family father = new Family(fatherName);
        Family family = new Family(child, mother, father);


        System.out.println("First family is:" + family);

        Family child2 = new Family(Family.getName());
        Family mother2 = new Family(createMother());
        Family father2 = new Family(createFather());
        Family family2 = new Family(child2, mother2, father2);
        System.out.println("Second family is:" + family2);

    }

    private static String createFather() {
        return Family.getName(0);
    }

    private static String createMother() {
        return Family.getName(1);
    }
}
