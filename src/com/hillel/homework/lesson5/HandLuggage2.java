package com.hillel.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HandLuggage2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length,sm  : ");
        Integer length = getSize(reader);
        System.out.println("Enter height, sm : ");
        Integer height = getSize(reader);
        System.out.println("Enter width, sm  : ");
        Integer width = getSize(reader);
        getSize(length, height, width);
   }

    private static void getSize(Integer length, Integer height, Integer width) {
        if (((length <= 40) || (length <= 55)) && ((height <= 53) || (height <= 40)) && ((width <= 22) || (width <= 20))) {
           System.out.println("You can take you luggage");
        } else {
            System.out.println("You cann't take you luggage");
        }
    }
    private static Integer getSize(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }
}