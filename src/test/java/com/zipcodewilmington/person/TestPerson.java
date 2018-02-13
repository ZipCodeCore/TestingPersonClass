package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        Person person = new Person();

        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName(){
        String expected = "Leon";
        Person person = new Person(expected);
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge(){
        Integer expected = 5;
        Person person = new Person(expected);
        person.setAge(expected);
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }





    @Test
    public void testConstructorWithNameAndAge(){
        Integer expectedAge = 5;
        String expectedName = "Leon";

        Person person = new Person(expectedName, expectedAge);

        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        Person person = new Person();
        String expected = "Leon";
        person.setName(expected);
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        Person person = new Person();
        Integer expected = 5;
        person.setAge(expected);
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFavoriteColorToGreen() {
        Person person = new Person();
        String expected = "Green";
        person.setFavoriteColorToGreen();
        String actual = person.getFavoriteColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFavoriteColor() {
        Person person = new Person();
        String expected = "Red";
        person.setFavoriteColor("Red");
        String actual = person.getFavoriteColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFavoriteAnimal() {
        Person person = new Person();
        String expected = "Lion";
        person.setFavoriteAnimal("Lion");
        String actual = person.getFavoriteAnimal();
        Assert.assertEquals(expected, actual);
    }
}
