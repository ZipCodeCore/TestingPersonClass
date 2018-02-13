package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        String expectedName = null;
        Integer expectedAge = 0;

        Person person = new Person();

        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        String expected = "Leon";
        Person person = new Person(expected);
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        Integer expected = 5;
        Person person = new Person(expected);
        person.setAge(expected);
        Integer actual = person.getAge();
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
    public void testSetHairColor() {
        Person person = new Person();
        String expected = "Brown";
        person.setHairColor(expected);
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyeColor() {
        Person person = new Person();
        String expected = "Blue";
        person.setEyeColor(expected);
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFingers() {
        Person person = new Person();
        Integer expected = 6;
        person.setFingers(expected);
        Integer actual = person.getFingers();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        Person person = new Person();
        Double expected = 6.5;
        person.setHeight(expected);
        Double actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetSalary() {
        Person person = new Person();
        Integer expected = 50000;
        person.setSalary(expected);
        Integer actual = person.getSalary();
        Assert.assertEquals(expected, actual);
    }

}