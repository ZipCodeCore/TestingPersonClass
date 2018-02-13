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
    public void testSetHeight() {
        // Given
        Person person = new Person();
        Integer expected = 60;

        // When
        person.setHeight(expected);

        // Then
        Integer actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetWeight() {
        // Given
        Person person = new Person();
        Integer expected = 120;

        // When
        person.setWeight(expected);

        // Then
        Integer actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetHaircolor() {
        // Given
        Person person = new Person();
        String expected = "Brown";

        // When
        person.setHaircolor(expected);
        String actual = person.getHaircolor();

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetEyecolor() {
        // Given
        Person person = new Person();
        String expected = "Green";

        // When
        person.setEyecolor(expected);
        String actual = person.getEyecolor();

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetGender() {
        // Given
        Person person = new Person();
        String expected = "Programmer";

        // When
        person.setGender(expected);
        String actual = person.getGender();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
