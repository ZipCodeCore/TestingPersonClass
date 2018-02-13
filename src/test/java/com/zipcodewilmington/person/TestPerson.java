package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        String expectedHairColor = "";
        String expectedEyeColor = "";
        String expectedGender = "";
        Double expectedWeight = Double.MAX_VALUE;
        Double expectedHeight = Double.MIN_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        String actualHairColor = person.getHairColor();
        String actualEyeColor = person.getEyeColor();
        String actualGender = person.getGender();
        Double actualWeight = person.getWeight();
        Double actualHeight = person.getHeight();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedHeight, actualHeight);

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
    public void testOverloadedConstructor(){
        //Given
        String expectedHairColor = "Blonde";
        String expectedEyeColor = "Blue";
        String expectedGender = "Female";
        Double expectedWeight = 110.5;
        Double expectedHeight = 6.5;

        //When
        Person person = new Person(expectedHairColor, expectedEyeColor, expectedGender,expectedWeight, expectedHeight);

        //Then
        String actualHairColor = person.getHairColor();
        String actualEyeColor = person.getEyeColor();
        String actualGender = person.getGender();
        Double actualWeight = person.getWeight();
        Double actualHeight = person.getHeight();



        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedHeight, actualHeight);

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
    public void testSetHairColor() {
        // Given
        Person person = new Person();
        String expected = "Blonde";

        // When
        person.setHairColor(expected);
        String actual = person.getHairColor();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testSetEyeColor() {
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
    public void testSetGender() {
        // Given
        Person person = new Person();
        String expected = "Female";

        // When
        person.setGender(expected);
        String actual = person.getGender();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeight() {
        // Given
        Person person = new Person();
        double expected = 115.9;

        // When
        person.setWeight(expected);
        double actual = person.getWeight();

        // Then
        assertEquals(expected, actual);
    }


    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        double expected = 5.4;

        // When
        person.setHeight(expected);
        double actual = person.getHeight();

        // Then
        assertEquals(expected, actual);
    }


}
