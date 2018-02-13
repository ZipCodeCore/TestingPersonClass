package com.zipcodewilmington.person;

public class Person {
    private String name;
    private int age;
    private char gender;
    private String job;
    private String hairColor;
    private int numOfSiblings;
    private int weight;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(Integer age) {
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

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setNumOfSiblings(int siblingCount) {
        this.numOfSiblings = siblingCount;
    }

    public void setWeight(int weight) {
        this.weight = weight;

    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public char getGender() {
        return this.gender;
    }

    public String getjob() {
        return this.job;
    }

    public String getHairColor() {
        return this.hairColor;
    }

    public int getNumOfSiblings() {
        return this.numOfSiblings;
    }

    public int getWeight() {
        return this.weight;
    }
}
