package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int heightInCM;
    private String eyeColor;
    private int weight;
    private String gender;
    private String sex;

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

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    //added methods

    public void setHeightInCM(int height){
        this.heightInCM = height;
    }

    public Integer getHeightInCM(){
        return this.heightInCM;
    }

    public void setEyeColor(String colorOfEyes){
        this.eyeColor = colorOfEyes;
    }

    public String getEyeColor(){
        return this.eyeColor;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public Integer getWeight(){
        return this.weight;
    }

    public void setGender (String gender){
        this.gender = gender;
    }

    public String getGender(){
        return this.gender;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public String getTheSex(){
        return this.sex;
    }
}
