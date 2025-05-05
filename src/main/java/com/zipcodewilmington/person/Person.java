package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;
    private String hairColor;
    private String birthMonth;
    private String talent;
    private char gender;
    public String nationality;



    public Person() {
    }

    public Person(int age) {
    }

    public Person(String name) {
    }

    public Person(String name, int age) {
    }


    public String Person (String talent){

        return " " ;
    }

    public char Person (char gender){

        return gender;
    }


    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(String name) {

        return name;
    }

    public Integer getAge(Integer age) {

        return age;
    }

    public String getHairColor(String hairColor) {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getTalent() {
        return talent;
    }

    public void setTalent(String talent) {
        this.talent = talent;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
