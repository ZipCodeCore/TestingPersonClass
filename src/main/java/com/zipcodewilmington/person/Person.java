package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {

    private String name;
    private int age;
//my 5 added fields:
    private int height;
    private int weight;
    private String gender;
    private String haircolor;
    private String eyecolor;

    public Person() {
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
    public void setHeight(int height) {

        this.height = height;
    }
    public void setWeight(int weight) {

        this.weight = weight;
    }

    public void setHaircolor(String haircolor) {

        this.haircolor = haircolor;
    }

    public void setEyecolor(String eyecolor) {

        this.eyecolor = eyecolor;
    }
    public void setGender(String gender) {

        this.gender = gender;
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
    public Integer getWeight() {

        return weight;
    }
    public String getHaircolor() {

        return haircolor;
    }
    public String getEyecolor() {

        return eyecolor;
    }

    public String getGender() {

        return gender;
    }
}
