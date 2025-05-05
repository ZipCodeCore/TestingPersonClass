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

    @Test
    public void testSetBirthMonth() {
        // Given
        Person person = new Person();
        Integer expected = 7;

        // When
        person.setBirthMonth(expected);

        // Then
        Integer actual = person.getBirthMonth();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetBirthYear() {
        // Given
        Person person = new Person();
        Integer expected = 1998;

        // When
        person.setBirthYear(expected);

        // Then
        Integer actual = person.getBirthYear();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetMiddleInitial() {
        // Given
        Person person = new Person();
        char expected = 'M';

        // When
        person.setMiddleInitial(expected);

        // Then
        char actual = person.getMiddleInitial();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFavoriteColor() {
        // Given
        Person person = new Person();
        String expected = "orange";

        // When
        person.setFavoriteColor(expected);

        // Then
        String actual = person.getFavoriteColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHasAPet() {
        // Given
        Person person = new Person();
        boolean expected = false;

        // When
        person.setHasAPet(expected);

        // Then
        boolean actual = person.getHasAPet();
        Assert.assertEquals(expected, actual);
    }
}
