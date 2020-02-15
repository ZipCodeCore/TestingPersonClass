package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String birthCountry;
    private int numberOfSpokenLangs;
    private String occupation;
    private String currentCity;
    private int weight;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.birthCountry = "";
        this.numberOfSpokenLangs = 0;
        this.occupation = "";
        this.currentCity = "";
        this.weight = 0;
    }

    public Person(int chosenAge) {
        this.age = chosenAge;
    }

    public Person(String chosenName) {
        this.name = chosenName;
    }

    public Person(String chosenName, int chosenAge) {
        this.name = chosenName;
        this.age = chosenAge;
    }

    public void setName(String chosenName) {
        this.name = chosenName;
    }
    public void setAge(int chosenAge) {
        this.age = chosenAge;
    }
    public void setbirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }
    public void setnumberOfSpokenLangs(int numberOfSpokenLangs) {
        this.numberOfSpokenLangs = numberOfSpokenLangs;
    }
    public void setoccupation(String occupation) {
        this.occupation = occupation;
    }
    public void setcurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }
    public void setweight(int weight) {
        this.weight = weight;
    }




    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public String getbirthCountry() {
        return birthCountry;
    }
    public int getnumberOfSpokenLangs() {
        return numberOfSpokenLangs;
    }
    public String getoccupation() {
        return occupation;
    }
    public String getcurrentCity() {
        return currentCity;
    }
    public int getweight() {
        return weight;
    }

}

