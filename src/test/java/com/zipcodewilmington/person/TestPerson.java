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
    public void testConstructorWithNameAgeEyeColorNumberOfCarsOccupationNumberOfPetsWeightInLB() {
        Integer expectedAge = 10;
        String expectedName = "Bob";
        String expectedEyeColor = "blue";
        Integer expectedNumberOfCars = 3;
        String expectedOccupation = "CEO";
        Integer expectedNumberOfPets = 0;
        Integer expectedWeightInLB = 165;


        // When
        Person person = new Person(expectedName, expectedAge, expectedEyeColor, expectedNumberOfCars, expectedOccupation, expectedNumberOfPets, expectedWeightInLB);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String actualEyeColor = person.getEyeColor();
        Integer actualNumberOfCars = person.getNumberOfCars();
        String actualOccupation = person.getOccupation();
        Integer actualNumberOfPets = person.getNumberOfPets();
        Integer actualWeightInLB = person.getWeightInLB();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedNumberOfCars, actualNumberOfCars);
        Assert.assertEquals(expectedOccupation, actualOccupation);
        Assert.assertEquals(expectedNumberOfPets, actualNumberOfPets);
        Assert.assertEquals(expectedWeightInLB, actualWeightInLB);

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
    public void testSetEyeColor() {
        Person person = new Person();
        String expected = "brown";

        person.setEyeColor(expected);

        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNumberOfCars() {
        Person person = new Person();
        Integer expected = 2;

        person.setNumberOfCars(expected);

        Integer actual = person.getNumberOfCars();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testSetOccupation() {
        Person person = new Person();
        String expected = "Software Developer";

        person.setOccupation(expected);

        String actual = person.getOccupation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNumberOfPets() {
        Person person = new Person();
        Integer expected = 2;

        person.setNumberOfPets(expected);

        Integer actual = person.getNumberOfPets();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeightInLB() {
        Person person = new Person();
        Integer expected = 150;

        person.setWeightInLB(expected);

        Integer actual = person.getWeightInLB();
        Assert.assertEquals(expected, actual);
    }


}
