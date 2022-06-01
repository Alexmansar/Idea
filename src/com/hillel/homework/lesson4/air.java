package com.hillel.homework.lesson4;

import java.lang.reflect.Array;

public class air {


    public static void main(String[] args) {
        printAirplaneInfo("Aerospatiale", "ATP");
        printAirplaneInfo("Airbus ", "A319neo", 150);
        printAirplaneInfo("Boeing", "777X", 325, 100);

    }

    public static void printAirplaneInfo(String s1, String s2) {

        System.out.println("Brand: " + s1 + ", Marka " + s2);
    }

    public static void printAirplaneInfo(String s1, String s2, int ecopass) {

        System.out.println("Brand: " + s1 + ", Marka " + s2 + ", economy seat " + ecopass);
    }

    public static void printAirplaneInfo(String s1, String s2, int ecopass, int buspass) {

        System.out.println("Brand: " + s1 + ", Marka " + s2 + ", economy seat " + ecopass + "; business seat " + buspass);
    }

}
