package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private char gender;
    private String occupation;
    private String favoriteColor;

    //Constructors
    public Person() {}

    public Person(int age) {this.age = age;}

    public Person(String name) {this.name = name;}

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    //Setters

    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age;}

    public void setGender(char gender) {this.gender = gender;}

    public void setOccupation(String occupation){this.occupation = occupation;}

    public void setFavoriteColor(String favoriteColor){this.favoriteColor = favoriteColor;}



    //Getters

    public String getName() {return name;}

    public Integer getAge() {return age;}

    public char getGender() {return gender;}

    public String getOccupation() {return occupation;}

    public String getFavoriteColor() {return favoriteColor;}
}
