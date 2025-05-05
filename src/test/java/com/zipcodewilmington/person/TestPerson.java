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
    public void testSetFacialHair() {
        //Given
        Person person = new Person();
        String expected = "moustache";
        //When
        person.setFacialHair(expected);
        //then
        String actual = person.setFacialHair();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetGlasses() {
        //Given
        Person person = new Person();
        String expected = "sunglasses";
        //When
        person.setGlasses(expected);
        //Then
        String actual = person.setGlasses();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEthnicity() {
        //Given
        Person person = new Person();
        String expected = "asian";
        //When
        person.setEthnicity(expected);
        //Then
        String actual = person.setEthnicity();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSetHeightInches() {
        //Given
        Person person =  new Person();
        Integer expected = 60;
        //When
        person.setHeightInches(expected);
        //Then
        Integer actual = person.setHeightInches();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSetWeight() {
        //Given
        Person person = new Person();
        Integer expected = 130;
        //When
        person.setWeightLbs(expected);
        //Then
        Integer actual = person.setWeightLbs();
        Assert.assertEquals(actual, expected);
    }
}
