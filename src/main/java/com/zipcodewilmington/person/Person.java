package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {


    private String name;
    private int age;
    private String hairColor;
    private int hait;
    private String nationality;
    private String favColor;
    private String favSong;


    public Person (String name, Integer age){
        this.name = name;
        this.age = age;
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



    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }


    public void setHait(int hait) {
        this.hait = hait;
    }

    public int getHait() {
        return hait;
    }


    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setFavoriteColor(String favColor) {
        this.favColor= favColor;
    }

    public String getFavoriteColor(){
        return favColor;
    }


    public void setFavoriteSong(String favSong) {
        this.favSong = favSong;
    }

    public String getFavoriteSong(){
        return favSong;
    }
}
