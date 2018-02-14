package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {

    private String name;
    private int age;

    public Person() {

    }
    //constructor
    public Person(int age) {

        this.age = age;
    }
    //constructor
    public Person(String name) {

        this.name= name;
    }
    //constructor
    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }
    //mutator
    public void setName(String name) {

        this.name = name;

    }
    //constructor
    public void setAge(int age) {
        this.age = age;


    }

    public String getName(String name) {
        return name;
    }

    public Integer getAge(int age) {
        return age;
    }

}
