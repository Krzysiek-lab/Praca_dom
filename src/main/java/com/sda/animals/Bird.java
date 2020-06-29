package com.sda.animals;

public class Bird extends Animal {
    @Override
    public String DoATrick() {
        return "BIRD FLIGHT BARREL";
    }


    @Override
    public String GiveASound() {
        return "CHIRP CHIRP";
    }

    @Override
    public String IntroduceYourself() {
        return "I'M A BIRD";
    }
}
