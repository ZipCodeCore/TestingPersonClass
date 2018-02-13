package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String bestAlbum;
    private String favoriteFood;
    private int luckyNumber;
    private String nightsOfSleep;
    private int coffeePerDay;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
        favoriteFood = "Pizza";
        bestAlbum = "Midnight Marauders";
        luckyNumber = 8;
        nightsOfSleep = "none";
        coffeePerDay = 3;

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

    public void setBestAlbum(String bestAlbums) {
        this.bestAlbum = bestAlbums;
    }

    public String getBestAlbum(){
        return this.bestAlbum;
    }

    public void setFavoriteFood(String favoriteFood){
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood (){
        return this.favoriteFood;
    }

    public void setLuckyNumber(int luckyNumber){
        this.luckyNumber = luckyNumber;
    }

    public Integer getLuckyNumber(){
        return this.luckyNumber;
    }

    public void setNightsOfSleep(String nightsOfSleep){
        this.nightsOfSleep = nightsOfSleep;
    }

    public String getNightsOfSleep(){
        return this.nightsOfSleep;
    }

    public void setCoffeePerDay(int coffeePerDay) {
        this.coffeePerDay = coffeePerDay;
    }

    public Integer getCoffeePerDay(){
        return this.coffeePerDay;
    }

}
