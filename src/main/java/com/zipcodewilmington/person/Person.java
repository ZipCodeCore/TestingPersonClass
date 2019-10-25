package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int height;
    private String city;
    private String state;
    private boolean student;

    // constructor
    public Person(String name, int age,int height, String city, String state, boolean student) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.city = city;
        this.state = state;
        this.student = student;
    }

    public Person(){
        name = "";
        age = Integer.MAX_VALUE;
        height = 51;
        city = "Baltimore";
        state = "Maryland";
        student = true;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(boolean student,int height) {
    }

    public Person(String city, String state) {
    }

    public Person(boolean student){

    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) { this.age = age;
    }
    public Integer getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

}
