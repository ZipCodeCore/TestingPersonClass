package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private boolean hasJob;
    private int salary;
    private String hairColor;
    private boolean hasPet;
    private String favoriteColor;

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

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setJob (boolean hasJob){
        this.hasJob = hasJob;
    }

    public boolean getJob(){
        return this.hasJob;
    }

    public void setSalary (int salary){
        this.salary = salary;
    }
    public Integer getSalary(){
        return this.salary;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return this.hairColor;
    }

    public boolean getHasPet() {
        return hasPet;
    }

    public void setHasPet(boolean hasPet) {
        this.hasPet = hasPet;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

//    public Person(int salary, String hairColor){
//        this.hairColor = hairColor;
//        this.salary = salary;
//    }
}
