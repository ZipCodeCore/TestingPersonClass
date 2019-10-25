package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    public Person()
    {
        setAge(Integer.MAX_VALUE);
        setName("");
    }

    public Person(int age)
    {
        setAge(age);
    }

    public Person(String name)
    {
        setName(name);
    }


    public Person(String name, int age)
    {
        setName(name);
        setAge(age);
    }

    //setter method for name variable
    public void setName(String name)
    {
        //private variable name in Person class
        this.name = name;
    }

    //setter method for age variable
    public void setAge(int age)
    {
        //private variable age in Person class
        this.age = age;
    }

    //getter method for name variable
    public String getName()
    {
        return name;
    }

    //getter method for age variable
    public Integer getAge()
    {
        return age;
    }
}
