package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        this("",Integer.MAX_VALUE); //will call the 2 parameter constructor
    }

    public Person(int age) {
        this("",age);
    }

    public Person(String name) {
        //this(name) // will call the Person(String name)
        this(name,Integer.MAX_VALUE);
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
}
