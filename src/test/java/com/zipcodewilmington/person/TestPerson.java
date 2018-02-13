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
    public void testHasTattos() {
        // Given
        Person person = new Person();
        boolean expected = true;

        // When
        person.setHasTattos(expected);

        // Then
        boolean actual = person.getHasTattos();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsHairPastShoulders() {
        // Given
        Person person = new Person();
        boolean expected = true;

        // When
        person.setIsHairPastShoulders(expected);

        // Then
        boolean actual = person.getIsHairPastShoulders();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWearsGlasses() {
        // Given
        Person person = new Person();
        boolean expected = true;

        // When
        person.setWearsGlasses(expected);

        // Then
        boolean actual = person.getWearsGlasses();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHeightInInches() {
        // Given
        Person person = new Person();
        int expected = 68;

        // When
        person.setHeightInInches(expected);

        // Then
        int actual = person.getHeightInInches();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWeightInPounds() {
        // Given
        Person person = new Person();
        int expected = 185;

        // When
        person.setWeightInPounds(expected);

        // Then
        int actual = person.getWeightInPounds();
        Assert.assertEquals(expected, actual);
    }
}
