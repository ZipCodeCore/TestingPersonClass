package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 * Michael Doll 10.25.2019
 */
public class Person {
    private String name;
    private String lastName;
    private int age;
    private int arms;
    private int legs;
    private int eyes;
    private String favoriteCereal;

    public Person() {}

    public Person(int age) { this.age = age; }

    public Person(String name) { this.name = name ; }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String lastName, int arms, int legs, int eyes, String favoriteCereal){
        this.lastName = lastName;
        this.arms = arms;
        this.legs = legs;
        this.eyes = eyes;
        this.favoriteCereal = favoriteCereal;
    }
    public Person(String name, int age, String lastName, int arms, int legs, int eyes, String favoriteCereal){
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        this.arms = arms;
        this.legs = legs;
        this.eyes = eyes;
        this.favoriteCereal = favoriteCereal;
    }
    public void setName(String name) {this.name = name;}

    public void setAge(int age) { this.age = age;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setArms(int arms){this.arms = arms; }
    public void setLegs(int legs){this.legs = legs; }
    public void setEyes(int eyes){this.eyes = eyes; }
    public void setFavoriteCereal(String favoriteCereal){this.favoriteCereal = favoriteCereal; }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
    public String getLastName(){return lastName;}
    public Integer getArms(){return arms;}
    public Integer getLegs(){return legs;}
    public Integer getEyes(){return eyes;}
    public String getFavoriteCereal(){return favoriteCereal;}
}
