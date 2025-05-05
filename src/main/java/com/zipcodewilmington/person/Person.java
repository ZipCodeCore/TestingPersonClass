package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int personAge) {
        age = personAge;

    }

    public Person(String nameOfPerson) {
        name = nameOfPerson;
    }

    public Person(String nameOfPerson, int ageOfPerson) {
        name = nameOfPerson;
        age = ageOfPerson;
    }

    public void setName(String nameOfPerson) {
        name = nameOfPerson;

    }

    public void setAge(int ageOfPerson) {
        age = ageOfPerson;
    }

    public String getName() {

        return name;
    }

    public Integer getAge() {

        return age;
    }
}
