package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String eyeColor;
    private String hairColor;
    private int weight;
    private String favoriteColor;
    private boolean hasGivenUpOnLife;



    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(boolean hasGivenUpOnLife) {
        this.hasGivenUpOnLife = hasGivenUpOnLife;
    }

    public Person(String name) {
        this.name = name;
    }
    public Person(int age){
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(int weight, String eyeColor, String hairColor, String favoriteColor){
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.favoriteColor = favoriteColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }
    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setFavoriteColor(String favoriteColor){
        this.favoriteColor = favoriteColor;
    }
    public void setHasGivenUpOnLife(boolean hasGivenUpOnLife){
        this.hasGivenUpOnLife = hasGivenUpOnLife;
    }

    public String getName() {
        return this.name;

    }

    public Integer getAge() {
        return this.age;

    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public int getWeight() {
        return weight;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public boolean isHasGivenUpOnLife() {
        return hasGivenUpOnLife;
    }
}
