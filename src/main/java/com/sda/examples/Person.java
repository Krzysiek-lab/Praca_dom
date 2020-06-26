package com.sda.examples;

public class Person {
    // ZAD 1.3
    String authorFirstName;
    String authorLastName;

    Person(String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;

    }

    @Override
    public String toString() {
        return authorFirstName+ " "+authorLastName;
    }
}
