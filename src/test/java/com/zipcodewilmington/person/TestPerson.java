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
        //Integer actual = person.getAge();
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
    public void testSetFavoriteFood() {
        Person person = new Person();
        String expected = "Pizza";
        person.setFavoriteFood(expected);
        String actual = person.getFavoriteFood();
        Assert.assertEquals(expected, actual);
     }

    @Test
    public void testSetBestAlbum() {
        Person person = new Person();
        String expected = "Midnight Marauders";
        person.setBestAlbum(expected);
        String actual = person.getBestAlbum();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLuckyNumber() {
        Person person = new Person();
        Integer expected = 8;
        person.setLuckyNumber(expected);
        Integer actual = person.getLuckyNumber();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNightsOfSleep() {
        Person person = new Person();
        String expected = "none";
        person.setNightsOfSleep(expected);
        String actual = person.getNightsOfSleep();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCoffeePerDay() {
        Person person = new Person();
        Integer expected = 3;
        person.setCoffeePerDay(expected);
        Integer actual = person.getCoffeePerDay();
        Assert.assertEquals(expected, actual);
    }
}
