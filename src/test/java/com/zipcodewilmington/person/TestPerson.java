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
        Integer expectedHeight = 0;
        Integer expectedWeight = 0;
        String expectedFavoriteFood = null;
        String expectedOccupation = null;
        String expectedEthnicity = null;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Integer actualHeight = person.getHeightInInches();
        Integer actualWeight = person.getWeightInPounds();
        String actualFavoriteFood = person.getFavoriteFood();
        String actualOccupation = person.getOccupation();
        String actualEthnicity = person.getEthnicity();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedFavoriteFood, actualFavoriteFood);
        Assert.assertEquals(expectedOccupation, actualOccupation);
        Assert.assertEquals(expectedEthnicity, actualEthnicity);
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
    public void testSetHeightInInches() {
        // Given
        Person person = new Person();
        Integer expected = 60;

        //When
        person.setHeightInInches(60);

        //Then
        Integer actual = person.getHeightInInches();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeightInPounds() {
        // Given
        Person person = new Person();
        Integer expected = 120;

        // When
        person.setWeightInPounds(120);

        // Then
        Integer actual = person.getWeightInPounds();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFavoriteFood() {
        // Given
        Person person = new Person();
        String expected = "cereal";

        // When
        person.setFavoriteFood("cereal");

        // Then
        String actual = person.getFavoriteFood();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetOccupation() {
        // Given
        Person person = new Person();
        String expected = "Developer";

        // When
        person.setOccupation("Developer");

        // Then
        String actual = person.getOccupation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEthnicity() {
        // Given
        Person person = new Person();
        String expected = "African American";

        // When
        person.setEthnicity("African American");

        // Then
        String actual = person.getEthnicity();
        Assert.assertEquals(expected, actual);
    }
}
