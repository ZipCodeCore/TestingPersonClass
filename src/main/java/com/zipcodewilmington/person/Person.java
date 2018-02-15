package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */

public class Person {
    private String name;
    private int age;
    private String favoriteColor;
    private String stateBorn;
    private int luckyNumber;
    private String food;
    private boolean isTall;


    // saving saves
    // well all but one test passes


    // getting favorite color  ... data type of the variable... returning the value passed in
    public String getFavoriteColor() {
        return favoriteColor;

    }
        // setting favorite color to the type of data it is (string here) and setting it to favorite color
    public void setFavoriteColor(String favoriteColor) {
        // "this".favoriteColor is being set to the variable I'm passing in... here it's favorite color.
        this.favoriteColor = favoriteColor;

    }

    public String getStateBorn() {
        return stateBorn;

    }

    public void setStateBorn(String stateBorn) {
        this.stateBorn = stateBorn;

    }

    public int getLuckyNumber() {
        return luckyNumber;

    }

    public void setLuckyNumber(int luckyNumber) {
        this.luckyNumber = luckyNumber;

    }

    public String getFood() {
        return food;

    }

    public void setFood(String food) {
        this.food = food;

    }

    public boolean getIsTall() {
        return isTall;

    }

    public void setIsTall(boolean isTall) {
        this.isTall = isTall;

    }


    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;




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
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
