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
    public void testConstructorWithName() {
        //Given
        String expected = "Leon";
        Person person = new Person(expected);

        //When
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        //Given
        Integer expected = 5;
        Person person = new Person(expected);

        //When
        person.setAge(expected);
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
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
    public void testSetWeight() {
        Person person = new Person();
        Integer expected = 150;
        person.setWeight(expected);
        Integer actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetShoeSize() {
        Person person = new Person();
        Integer expected = 8;
        person.setShoeSize(expected);
        Integer actual = person.getShoeSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHairColor() {
        String expected = "Brown";
        Person person = new Person(expected);
        person.setHairColor(expected);
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEyeColor() {
        String expected = "Blue";
        Person person = new Person(expected);
        person.setEyeColor(expected);
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSkinColor() {
        String expected = "Tan";
        Person person = new Person(expected);
        person.setSkinColor(expected);
        String actual = person.getSkinColor();
        Assert.assertEquals(expected, actual);
    }
}

