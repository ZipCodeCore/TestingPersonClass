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
    public void testSetHairType() {
        //Given
        Person person = new Person();
        String expected = "curly";

        //When
        person.setHairType(expected);

        //Then
        String actual = person.getHairType();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyeColor() {
        //Given
        Person person = new Person();
        String expected = "brown";

        //When
        person.setEyeColor(expected);

        //Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHasGlasses() {
        //Given
        Person person = new Person();
        Boolean expected = true;

        //When
        person.setGlasses(true);

        //Then
        Boolean actual = person.isGlasses();
        Assert.assertEquals(true, actual);
    }

    @Test
    public void testAmountOfTeeth() {
        //Given
        Person person = new Person();
        Integer expected = 32;

        //When
        person.setAmountOfTeeth(expected);

        //Then
        Integer actual = person.getAmountOfTeeth();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWingSpan() {
        //Given
        Person person = new Person();
        Integer expected = 65;

        //When
        person.setWingSpan(expected);

        //Then
        Integer actual = person.getWingSpan();
        Assert.assertEquals(expected, actual);
    }




} // final brace
