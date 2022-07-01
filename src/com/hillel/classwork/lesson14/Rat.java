package com.hillel.classwork.lesson14;

public class Rat extends Animal{

    public Rat (String colour){
        super(colour);
    }
    public void steal() {
        System.out.println("крыса что то украла!");
    }
    @Override
    public void speak() {

    }
}
