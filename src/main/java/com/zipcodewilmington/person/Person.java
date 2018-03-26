package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int heightInInches;
    private int weightInPounds;
    private String favoriteFood;
    private String occupation;
    private String ethnicity;

    public Person() {
        this.age = Integer.MAX_VALUE;
        this.name = "";
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

    public void setHeightInInches(int height) {
        this.heightInInches = height;
    }

    public void setWeightInPounds(int weight) {
        this.weightInPounds = weight;
    }

    public void setFavoriteFood(String food) {
        this.favoriteFood = food;
    }

    public void setOccupation(String job) {
        this.occupation = job;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public Integer getHeightInInches() { return this.heightInInches; }

    public Integer getWeightInPounds() { return this.weightInPounds; }

    public String getFavoriteFood() { return this.favoriteFood; }

    public String getOccupation() { return this.occupation; }

    public String getEthnicity() { return this.ethnicity; }
}
