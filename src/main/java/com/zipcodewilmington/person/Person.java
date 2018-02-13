package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private boolean hasTattoos;
    private boolean isHairPastShoulders;
    private boolean wearsGlasses;
    private int heightInInches;
    private int weightInPounds;


    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
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

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setHasTattos(boolean hasTattoos) {
        this.hasTattoos = hasTattoos;
    }

    public boolean getHasTattos() {
        return this.hasTattoos;
    }

    public void setIsHairPastShoulders(boolean isHairPastShoulders) {
        this.isHairPastShoulders = isHairPastShoulders;
    }

    public boolean getIsHairPastShoulders() {
        return this.isHairPastShoulders;
    }

    public void setWearsGlasses(boolean wearsGlasses) {
        this.wearsGlasses = wearsGlasses;
    }
    public boolean getWearsGlasses() {
        return this.wearsGlasses;
    }
    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }
    public int getHeightInInches() {
        return this.heightInInches;
    }
    public void setWeightInPounds(int weightInPounds) {
        this.weightInPounds = weightInPounds;
    }
    public int getWeightInPounds () {
        return this.weightInPounds;
    }





}
