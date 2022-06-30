package com.hillel.homework.lesson12.person;

public class Person {
    public static int MAN = 0;
    public static int WOMAN = 0;
    String name;
    String surname;
    int age;
    int weight;
    int height;


    @Override
    public String toString() {
        return "Person " +
                "name=" + name +
                ", surname=" + surname +
                ", age=" + age +
                ", weight=" + weight + "kg" +
                ", height=" + height + "sm";
    }

    public Person() {
        this.name = getName();
        this.surname = getSurname();
        this.age = getAge();
        this.weight = getWeight();
        this.height = getHeight();
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static String getName() {
        String name = null;
        String[] namesMan = {"Alex", "Ben", "Maksim", "Egor", "Simon", "Liam", "Mason", "Michael"};
        String[] namesWoman = {"Julia", "Sarah", "Kaila", "Scarlett", "Megan", "Sofia", "Olivia", "Mia"};
        int sex = (int) (Math.random() * 2);
        int number = (int) (Math.random() * namesMan.length);
        switch (sex) {
            case 0 -> {
                name = namesMan[number];
                MAN++;
            }
            case 1 -> {
                name = namesWoman[number];
                WOMAN++;
            }
        }
        return name;
    }

    public static String getName(int sex) {
        String name = null;
        String[] namesMan = {"Alex", "Ben", "Maksim", "Egor", "Simon", "Liam", "Mason", "Michael"};
        String[] namesWoman = {"Julia", "Sarah", "Kaila", "Scarlett", "Megan", "Sofia", "Olivia", "Mia"};
       // int sex = (int) (Math.random() * 2);
        int number = (int) (Math.random() * namesMan.length);
        switch (sex) {
            case 0 -> {
                name = namesMan[number];
                MAN++;
            }
            case 1 -> {
                name = namesWoman[number];
                WOMAN++;
            }
        }
        return name;
    }

    public static String getSurname() {
        String surname;
        String[] surnames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor"};
        int number = (int) (Math.random() * surnames.length);
        surname = surnames[number];
        return surname;
    }

    public static int getAge() {
        int minAge = 20;
        int maxAge = 80;
        return (int) (Math.random() * (maxAge - minAge) + minAge);
    }

    public static int getWeight() {
        int minWeight = 50;
        int maxWeight = 100;
        return (int) (Math.random() * (maxWeight - minWeight) + minWeight);
    }

    public static int getHeight() {
        int minHeight = 140;
        int maxHeight = 200;
        return (int) (Math.random() * (maxHeight - minHeight) + minHeight);
    }
}