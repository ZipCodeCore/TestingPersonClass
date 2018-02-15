package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int weight;
    private String gender;
    private int height;
    private String hairColor;
    private String nationality;

    public Person() {
        name ="";
        age =Integer.MAX_VALUE;
    }

    public Person(int newage) {
        this.age = newage;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    public int getWeight(){
        return this.weight;
    }
    public String getGender(){
        return this.gender;
    }

    public void setName(String name) {
        this.name =name;


    }


    public void setAge(int age) {
        this.age =age;
    }





}
