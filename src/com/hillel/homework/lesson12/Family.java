package com.hillel.homework.lesson12;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Family {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    String name;
    Family child;
    Family mother;
    Family father;

    public Family(String name) {
        this.name = name;
    }

    public Family(Family child, Family mother, Family father) {
        this.child = child;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        String baby = child != null ? "" + child.name : "";
        String mom = mother != null ? "" + mother.name : "";
        String dad = father != null ? "" + father.name : "";
        return "Child name is " + baby +
                ", mother name is " + mom +
                ", father name is " + dad;
    }

    public static int findSex(String name) {
        int sex = 0;
        if (name.equals("Alex") || name.equals("Ben") || name.equals("Maksim") || name.equals("Egor") || name.equals("Simon")) {
        } else {
            sex = 1;
        }
        return sex;
    }

    public static String getName(int sex) {
        String name = null;
        String[] namesMan = {"Alex", "Ben", "Maksim", "Egor", "Simon"};
        String[] namesWoman = {"Julia", "Sarah", "Kaila", "Scarlett", "Megan", "Sofia", "Olivia", "Mia"};
        int number = (int) (Math.random() * namesMan.length);
        switch (sex) {
            case 0 -> name = namesMan[number];
            case 1 -> name = namesWoman[number];
        }
        return name;
    }

    public static String getName() {
        String name = null;
        String[] namesMan = {"Alex", "Ben", "Maksim", "Egor", "Simon"};
        String[] namesWoman = {"Julia", "Sarah", "Kaila", "Scarlett", "Megan", "Sofia", "Olivia", "Mia"};
        int sex = (int) (Math.random() * 2);
        int number = (int) (Math.random() * namesMan.length);
        switch (sex) {
            case 0 -> name = namesMan[number];
            case 1 -> name = namesWoman[number];
        }
        return name;
    }

    public static boolean isValid(int numberOfGeneration) {
        if (numberOfGeneration <= 0) {
            System.out.println("Enter number more than 0");
        } else {
            return false;
        }
        return true;
    }

    public static String getString() {
        String childName = Family.getName();
        Family child = new Family(childName);
        Family mother = new Family(createMother());
        Family father = new Family(createFather());
        Family family = new Family(child, mother, father);
        System.out.println("N1 family is: " + family);
        return childName;
    }

    public static void getString(String name, int number) {
        String[] names = new String[number];
        names[0] = name;
        for (int i = 1; i < names.length; i++) {
            names[i] = Family.getName();
            int sex = Family.findSex(names[i - 1]);
            Family child = new Family(names[i]);
            Family mother = new Family(createMother(sex, names[i - 1]));
            Family father = new Family(createFather(sex, names[i - 1]));
            Family family = new Family(child, mother, father);
            System.out.println("N" + (i + 1) + " family is: " + family);
        }
    }

    public static String createMother(int sex, String childName) {
        String motherName;
        if (sex == 1) {
            motherName = childName;
        } else {
            motherName = Person.getName(1);
        }
        return motherName;
    }

    public static String createMother() {
        return Person.getName(1);
    }

    public static String createFather(int sex, String childName) {
        String fatherName;
        if (sex == 0) {
            fatherName = childName;
        } else {
            fatherName = Person.getName(0);
        }
        return fatherName;
    }


    public static String createFather() {
        return Person.getName(0);
    }
}