package com.sda.animals;

public class PersonApp {
    public static void main(String[] args) {
        Person inst0 = new Person(new Dog(), new Cat(), new Bird());
        System.out.println(inst0.inst1.IntroduceYourself());
        System.out.println(inst0.inst1.GiveASound());
        System.out.println(inst0.inst1.DoATrick());
        System.out.println();
        System.out.println(inst0.inst2.IntroduceYourself());
        System.out.println(inst0.inst2.GiveASound());
        System.out.println(inst0.inst2.DoATrick());
        System.out.println();
        System.out.println(inst0.inst3.IntroduceYourself());
        System.out.println(inst0.inst3.GiveASound());
        System.out.println(inst0.inst3.DoATrick());
    }
}
