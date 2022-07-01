package com.hillel.classwork.lesson14;

public class Cat extends Animal {

   private String breed;


    public Cat(String colour, String breed) {
        super(colour);
        this.breed = breed;
    }


    @Override
    public void speak() {
        super.speak();
        System.out.println("mau");
    }
}
