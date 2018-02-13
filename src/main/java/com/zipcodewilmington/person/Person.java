package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String eyeColor;
    private String sex;
    private double weight;
    private String hair;


    public Person() {
//        name = "";
//        age = Integer.MAX_VALUE;
//        eyeColor = "";
//        sex = "";
//        weight = Integer.MAX_VALUE;
//        hair = "";


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

    public Person(String name, int age, String eyeColor,String sex, double weight, String hair) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.sex = sex;
        this.weight = weight;
        this.hair = hair;
    }


    public void setName(String name) {
        this.name = name;

    }

    public void setAge (int age){
            this.age = age;

        }

        public String getName () {

            return this.name;

        }

        public Integer getAge () {

            return this.age;
        }


    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }


    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void setHair(String hair) {
        this.hair = hair;
    }

    public double getWeight() {
        return weight;
    }

    public String getHair() {
        return hair;
    }


}



