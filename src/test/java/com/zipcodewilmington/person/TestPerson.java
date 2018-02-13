package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    //FIRST, new constructor test
    @Test
    public void testConstructorWithNameMiddlenameLastname() {
        // Given
        String expectedName = "Leon";
        String expectedMiddlename = "middlename";
        String expectedLastname = "lastname";

        // When
        Person person = new Person(expectedName, expectedMiddlename, expectedLastname);

        // Then
        String actualName = person.getName();
        String actualMiddlename = person.getMiddlename();
        String actualLastname = person.getLastname();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedMiddlename, actualMiddlename);
        Assert.assertEquals(expectedLastname, actualLastname);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    //FOURTH
    @Test
    public void testSetPhoneNumber() {
        // Given
        Person person = new Person();
        String expected = "(111) 222-3333";

        // When
        person.setPhoneNumber(expected);

        // Then
        String actual = person.getPhoneNumber();
        Assert.assertEquals(expected, actual);
    }
}
