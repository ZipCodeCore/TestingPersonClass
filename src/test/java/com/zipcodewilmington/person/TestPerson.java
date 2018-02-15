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
    public void hasGivenUpOnLifeTest() {
        // Given
        boolean expected = true;

        // When
        Person person = new Person(true);

        // Then
        boolean actual = person.isHasGivenUpOnLife();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void ConstructorWithWeightEyeColorHairColorFavoriteColorTest() {
        // Given
        Integer expectedWeight = 5;
        String expectedEyeColor = "Brown";
        String expectedHairColor = "Brown";
        String expectedFavoriteColor = "purple";

        // When
        Person person = new Person(expectedWeight, expectedEyeColor, expectedHairColor, expectedFavoriteColor);

        // Then
        Integer actualWeight = person.getWeight();
        String actualEyeColor = person.getEyeColor();
        String actualHairColor = person.getHairColor();
        String actualFavoriteColor = person.getFavoriteColor();

        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedFavoriteColor, actualFavoriteColor);
    }



    @Test
    public void testSetName() {
        // Given
        Person person = new Person(true);
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
        Person person = new Person(true);
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
}
