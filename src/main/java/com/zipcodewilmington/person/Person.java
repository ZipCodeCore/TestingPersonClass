package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {

    private String name;
    private int age;
    private String hairColor;
    private String eyeColor;
    private double height;
    private int fingers;
    private int salary;


    public Person() {

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

    public void setEyeColor(String eyeColor) {

        this.eyeColor = eyeColor;
    }

    public String getEyeColor() {
        return eyeColor;

    }

    public void setFingers(int fingers) {
        this.fingers = fingers;
    }

    public int getFingers() {
        return fingers;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
