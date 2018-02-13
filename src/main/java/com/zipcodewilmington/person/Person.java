package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String pet;
    private String hairColor;
    private String favoriteSport;
    private String whereTheyLive;
    private String whereTheyWork;


    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
        pet = "";
        hairColor= "";
        favoriteSport= "";
        whereTheyLive= "";
        whereTheyWork= "";



    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setFavoriteSport(String favoriteSport) {
        this.favoriteSport = favoriteSport;
    }

    public void setWhereTheyLive(String whereTheyLive) {
        this.whereTheyLive = whereTheyLive;
    }

    public void setWhereTheyWork(String whereTheyWork) {
        this.whereTheyWork = whereTheyWork;
    }


    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getPet() { return this.pet; }

    public String getHairColor() {
        return this.hairColor;
    }

    public String getFavoriteSport() {
        return this.favoriteSport;
    }

    public String getWhereTheyLive() {
        return this.whereTheyLive;
    }

    public String getWhereTheyWork() { return this.whereTheyWork;
    }

}
