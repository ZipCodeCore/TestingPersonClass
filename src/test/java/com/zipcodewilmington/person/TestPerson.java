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
    public void testSetFavoriteColor(){
        Person person = new Person();
        String expected = "Blue";
        person.setFavoriteColor(expected);
        String actual = person.getFavoriteColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHomeState(){
        Person person = new Person();
        String expected = "Ohio";
        person.setHomeState(expected);
        String actual = person.getHomeState();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfPets(){
        Person person = new Person();
        Integer expected = 6;
        person.setNumberOfPets(expected);
        Integer actual = person.getNumberOfPets();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetLuckyNumber(){
        Person person = new Person();
        Integer expected = 11;
        person.setLuckyNumber(expected);
        Integer actual = person.getLuckyNumber();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFavoriteShow(){
        Person person = new Person();
        String expected = "Game of Thrones";
        person.setFavoriteShow(expected);
        String actual = person.getFavoriteShow();
        Assert.assertEquals(expected, actual);
    }

}
