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
    public void getHeight() {
        // Given
        Person person = new Person();
        Double expected = 6.2;

        // When
        person.setHeight(expected);

        // Then
         Double actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setHeight() {
        // Given
        Person person = new Person();
        Double expected = 6.2;

        // When
        person.setHeight(expected);

        // Then
        Double actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEyeColor() {
        // Given
        Person person = new Person();
        String expected = "green";

        // When
        person.setEyeColor(expected);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setEyeColor() {
        // Given
        Person person = new Person();
        String expected = "green";

        // When
        person.setEyeColor(expected);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHairColor() {
        // Given
        Person person = new Person();
        String expected = "Black";

        // When
        person.setHairColor(expected);

        // Then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setHairColor() {
        // Given
        Person person = new Person();
        String expected = "Black";

        // When
        person.setHairColor(expected);

        // Then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAmountOfToes() {
        // Given
        Person person = new Person();
        Integer expected = 10;

        // When
        person.setAmountOfToes(expected);

        // Then
        Integer actual = person.getAmountOfToes();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAmountOfToes() {
        // Given
        Person person = new Person();
        Integer expected = 10;

        // When
        person.setAmountOfToes(expected);

        // Then
        Integer actual = person.getAmountOfToes();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFavoriteDayofTheWeek() {
        // Given
        Person person = new Person();
        String expected = "Friday";

        // When
        person.setFavoriteDayofTheWeek(expected);

        // Then
        String actual = person.getFavoriteDayofTheWeek();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setFavoriteDayofTheWeek() {
        // Given
        Person person = new Person();
        String expected = "Friday";

        // When
        person.setFavoriteDayofTheWeek(expected);

        // Then
        String actual = person.getFavoriteDayofTheWeek();
        Assert.assertEquals(expected, actual);
    }

}

