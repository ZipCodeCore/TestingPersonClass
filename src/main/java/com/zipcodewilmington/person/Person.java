package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;

    }

    public Person(int thisAge) {
        age = thisAge;
    }




    public Person(String thisName) {
        name = thisName;
    }


    public Person(String thisName, int thisAge) {
        name = thisName;
        age = thisAge;


    }

    public void setName(String thisName) {
        name = thisName;


    }

    public void setAge(int thisAge) {
        age = thisAge;

    }

    public String getName() {

        return name;

    }

    public Integer getAge() {
        return age;
    }
}
