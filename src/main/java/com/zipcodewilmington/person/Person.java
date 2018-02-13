package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String hairColor;
    private int heightInInches;
    private int weightInPounds;

    public Person() {
    name = "";
    age = Integer.MAX_VALUE;
    hairColor = "Dirty brown";
    heightInInches = 75;
    weightInPounds = 205;


    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }
    public void setWeightInPounds(int weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public String getName() { return this.name; }

    public Integer getAge() {
        return this.age;
    }

    public String getHairColor() { return this.hairColor; }

    public Integer getHeightInInches() { return this.heightInInches; }

    public Integer getWeightInPounds() { return this.weightInPounds; }


}
