package com.hillel.homework.lesson4;

public class fuel {
    public static void main(String[] args) {
        double V=fuelConsumption(250,5.5);
        System.out.println("Fuel consumption = "+V+" l/100km");

    }
    public static double fuelConsumption (double l, double v){
        return v/l*100;
    }
}
