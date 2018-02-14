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
        String expectedName = null;
        Integer expectedAge = 0;

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
    public void testConstructorWithEyecolor() {
        // Given
        String expected = "blue";

        // When
        Person person = new Person(expected);
        person.setEyeColor(expected);
        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithGender() {
        // Given
        String expected = "Male";

        // When
        Person person = new Person(expected);
        person.setGender(expected);
        // Then
        String actual = person.getGender();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithShirtSize() {
        // Given
        String expected = "medium";

        // When
        Person person = new Person(expected);
        person.setShirtSize(expected);
        // Then
        String actual = person.getShirtSize();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithHeight() {
        // Given
        String expected = "average";

        // When
        Person person = new Person(expected);
        person.setHeight(expected);
        // Then
        String actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithHairColor() {
        // Given
        String expected = "brown";

        // When
        Person person = new Person(expected);
        person.setHaircolor(expected);
        // Then
        String actual = person.getHaircolor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyecolor() {
        // Given
        Person person = new Person();
        String expected = "Blue";

        // When
        person.setEyeColor(expected);
        String actual = person.getEyeColor();

        // Then
        Assert.assertEquals(expected, actual);
        }

    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        String expected = "tall";

        // When
        person.setHeight(expected);
        String actual = person.getHeight();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetGender() {
        // Given
        Person person = new Person();
        String expected = "male";

        // When
        person.setGender(expected);
        String actual = person.getGender();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetShirtSize() {
        // Given
        Person person = new Person();
        String expected = "Medium";

        // When
        person.setShirtSize(expected);
        String actual = person.getShirtSize();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHairColor() {
        // Given
        Person person = new Person();
        String expected = "brown";

        // When
        person.setHaircolor(expected);
        String actual = person.getHaircolor();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
