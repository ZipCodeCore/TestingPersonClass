package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private String homeTown;
    private String hairColor;
    private String eyeColor;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
        gender = "Male";
        homeTown = "Woolridge";
        hairColor = "Red";
        eyeColor = "Blue";
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

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;

    }

    public String getEyeColor() {
        return eyeColor;
    }
    public void setEyeColor(){
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }
    public void setHairColor(){
        this.hairColor = hairColor;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(){
        this.gender = gender;
    }

    public String gethomeTown() {
        return homeTown;
    }
    public void setHomeTown(){
        this.homeTown = homeTown;
    }
}
