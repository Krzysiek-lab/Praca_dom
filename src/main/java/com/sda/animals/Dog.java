package com.sda.animals;

public class Dog extends Animal {
    @Override
    public String DoATrick() {
        return "DOG JUMP";
    }


    @Override
    public String GiveASound() {
        return "HAU HAU";
    }

    @Override
    public String IntroduceYourself() {
        return "I'M A DOG";
    }
}
