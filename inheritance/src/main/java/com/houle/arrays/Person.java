package com.houle.arrays;

public abstract class Person {
    public abstract String getDescription();
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
