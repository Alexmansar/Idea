package com.hillel.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HandLuggage {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length,sm  : ");
        int length = Integer.parseInt(reader.readLine());
        System.out.println("Enter height, sm : ");
        int heigth = Integer.parseInt(reader.readLine());
        System.out.println("Enter width, sm  : ");
        int width = Integer.parseInt(reader.readLine());
        System.out.println("Enter 1 (suitcase) or (2) bag : ");
        int lug = Integer.parseInt(reader.readLine());
        if (lug == 1) {
            System.out.println("Your choice is Suitcase");
        } else {
            System.out.println("Your choice is Bag");
        }
        if (lug == 1) {
            if (lug == 1 && length <= 40 && heigth <= 53 && width <= 22) {
                System.out.println("You can take you Suitcase");
            } else {
                System.out.println("You cann't take you Suitcase");
            }
        } else {
            if (lug == 2 && length <= 55 && heigth <= 40 && width <= 20) {
                System.out.println("You can take you Bag");
            } else {
                System.out.println("You cann't take you Bag");
            }
        }
    }
}