package com.sda.animals;

public class Cat extends Animal {
    @Override
    public String DoATrick() {
        return "CAT ROLL";
    }


    @Override
    public String GiveASound() {
        return "MIAU MIAU";
    }

    @Override
    public String IntroduceYourself() {
        return "I'M A CAT";
    }
}
