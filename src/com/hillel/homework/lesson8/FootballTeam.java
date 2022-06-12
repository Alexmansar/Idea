package com.hillel.homework.lesson8;

public class FootballTeam {
    public static void main(String[] args) {
        int player=11;
        int[] ageTeam1 = new int[player];
        int[] ageTeam2 = new int[player];
        int minAge = 18;
        int maxAge = 45;
        generateAge(ageTeam1, minAge, maxAge, 1);
        generateAge(ageTeam2, minAge, maxAge, 2);
        int averageAgeTeam1 = calcAverageAge(ageTeam1, 1);
        int averageAgeTeam2 = calcAverageAge(ageTeam2, 2);
        calcLargerAverageAge(averageAgeTeam1, averageAgeTeam2);
    }

    private static void generateAge(int[] ageTeam1, int minAge, int maxAge, int teamNumber) {
        System.out.println();
        System.out.println("Age " + teamNumber + " team");
        for (int i = 0; i < ageTeam1.length; i++) {
            int age = (int) (Math.random() * (maxAge - minAge) + minAge);
            ageTeam1[i] = age;
            System.out.print(age + ", ");
        }
    }

    public static int calcAverageAge(int[] age, int teamNumber) {
        int a = 0;
        for (int j : age) {
            a = a + j;
        }
        System.out.println();
        System.out.print("Average age of team number " + teamNumber + " is " + a / age.length);
        return a;

    }

    public static void calcLargerAverageAge(int averageAge1, int averageAge2) {
        System.out.println();
        if (averageAge1 > averageAge2) {
            System.out.println("Average age of the first team is larger then second team ");
        } else if (averageAge2 > averageAge1) {
            System.out.println("Average age of the second team is larger then first team ");
        } else {
            System.out.println("The average age of the teams is the same");
        }

    }

}