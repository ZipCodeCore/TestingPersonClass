package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String favoriteAnimal;
    private String birthDay;



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

    public Person(String name, int age, String birthDay){
        this.name = name;
        this.age = age;
        this.birthDay = birthDay;
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

    public void setBirthDay(String birthDay){
        this.birthDay = birthDay;
    }

    public String getBirthDay(){
        return birthDay;
    }

    public void setFavoriteAnimal(String favoriteAnimal){
        this.favoriteAnimal = favoriteAnimal;
    }

    public String getFavoriteAnimal(){
        return favoriteAnimal;
    }
}
