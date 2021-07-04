package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private Double gpa;
    private String name;
    private int age;
    private Integer height;

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

    public Person(String name, int age, Integer height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person(String name, Integer age, Integer height, Double gpa) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gpa = gpa;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String getName() {

        return name;
    }

    public Integer getAge() {
        return age;
    }



    public Integer getHeight() {
        return height;
    }


    public void setHeight(Integer height) {
        this.height = height;
    }

    public Double getGPA() {
        return gpa;
    }
}
