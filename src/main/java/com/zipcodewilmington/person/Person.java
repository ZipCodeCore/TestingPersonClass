package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name = "";
    private int age;

    public Person(Double height, String eyeColor, String hairColor, Integer amountOfToes, String favoriteDayofTheWeek) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.amountOfToes = amountOfToes;
        this.favoriteDayofTheWeek = favoriteDayofTheWeek;
    }

    private Double height;
    private String eyeColor;
    private String hairColor;
    private Integer amountOfToes;
    private String favoriteDayofTheWeek;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public Integer getAmountOfToes() {
        return amountOfToes;
    }

    public void setAmountOfToes(Integer amountOfToes) {
        this.amountOfToes = amountOfToes;
    }

    public String getFavoriteDayofTheWeek() {
        return favoriteDayofTheWeek;
    }

    public void setFavoriteDayofTheWeek(String favoriteDayofTheWeek) {
        this.favoriteDayofTheWeek = favoriteDayofTheWeek;
    }




    public Person() {
        age = Integer.MAX_VALUE;
    }

    public Person(int givenAge) {
        age = givenAge;

    }

    public Person(String givenName) {
        name = givenName;

    }

    public Person(String givenName, int givenAge) {
        name = givenName;
        age = givenAge;

    }

    public void setName(String givenName) {
        name = givenName;
    }

    public void setAge(int givenAge) {
        age = givenAge;

    }

    public String getName() {
        return name;
    }

    public Integer getAge() {

        return (Integer)age;
    }
}
