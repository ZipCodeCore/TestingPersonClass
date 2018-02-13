package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        Person person = new Person();

        String expectedName = null;
        Integer expectedAge = 0;


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
    public void testSetHeight() {
        Person person = new Person();
        Integer expected = 62;
        person.setHeight(expected);
        Integer actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetShoeSize() {
        Person person = new Person();
        Integer expected = 6;
        person.setShoeSize(expected);
        Integer actual = person.getShoeSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHairColor() {
        Person person = new Person();
        String expected = "brown";
        person.setHairColor(expected);
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyeColor() {
        Person person = new Person();
        String expected = "blue";
        person.setEyeColor(expected);
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetDateOfBirth() {
        Person person = new Person();
        String expected = "July 7, 1990";
        person.setDateOfBirth(expected);
        String actual = person.getDateOfBirth();
        Assert.assertEquals(expected, actual);
    }

}
