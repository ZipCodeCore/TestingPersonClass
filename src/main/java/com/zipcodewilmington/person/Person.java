package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name = "";
    private int age;
    private Double height;
    private String eyeColor;
    private String hairColor;
    private Integer amountOfToes;
    private ;

    public Person() {
        age = Integer.MAX_VALUE;
    }

    public Person(int givenAge) {
        age = givenAge;

    }

    public Person(String givenName) {
        name = givenName;

    }

    public Person(String givenName, int givenAge) {
        name = givenName;
        age = givenAge;

    }

    public void setName(String givenName) {
        name = givenName;
    }

    public void setAge(int givenAge) {
        age = givenAge;

    }

    public String getName() {
        return name;
    }

    public Integer getAge() {

        return (Integer)age;
    }
}
