package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String favoriteColor;
    private String favoriteAnimal;
    private String favoriteGame;
    private double height;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
        favoriteColor = "";
        favoriteAnimal = "";
        favoriteGame = "";
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
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

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setFavoriteColor(String color) {
        this.favoriteColor = color;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColorToGreen() {
        this.favoriteColor = "Green";
    }

    public void setFavoriteAnimal(String animal) {
        this.favoriteAnimal = animal;
    }

    public String getFavoriteAnimal() {
        return favoriteAnimal;
    }

    public void setFavoriteGame(String game) {
        this.favoriteGame = game;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

}
