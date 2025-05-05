package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;
//    private int birthYear;
//    private int numberOfSiblings;
//    private String hairColor;
//    private String eyeColor;
//    private String favoriteColor;





    public Person() {
     this.name = "";
     this.age = Integer.MAX_VALUE;
//     this.birthYear = Integer.MAX_VALUE;
//     this.numberOfSiblings = Integer.MAX_VALUE;
//     this.hairColor = "";
//     this.eyeColor = "";
//     this.favoriteColor = "";

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
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
