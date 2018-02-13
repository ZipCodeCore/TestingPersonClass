package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    //Five new fields:
    private String middlename;
    private String lastname;
    private String phoneNumber;
    private String city;
    private int zipcode;

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

    //FIRST, new constructor
    public Person(String name, String middleName, String lastName) {
        this.name = name;
        this.middlename = middleName;
        this.lastname = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //SIXTH
    public void setCity(String city) {
        this.city = city;
    }

    //EIGHTH
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    //FOURTH
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    //SECOND
    public String getMiddlename() {
        return this.middlename;
    }

    //THIRD
    public String getLastname() {
        return this.lastname;
    }

    public Integer getAge() {
        return this.age;
    }

    //FIFTH
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    //SEVENTH
    public String getCity() {
        return this.city;
    }

    //NINTH
    public int getZipcode() {
        return this.zipcode;
    }

}
