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
    public void testSetHairColor() {
        //given
        Person person = new Person();
        String expected = "brown";
        //when
        person.setHairColor(expected);
        //then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetEyeColor() {
        //given
        Person person = new Person();
        String expected = "hazel";
        //when
        person.setEyeColor(expected);
        //then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testHeight() {
        //given
        Person person = new Person();
        int expected = 67;
        //when
        person.setHeight(expected);
        //then
        int actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testWeight() {
        //given
        Person person = new Person();
        int expected = 155;
        //when
        person.setWeight(expected);
        //then
        int actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testOccupation() {
        //given
        Person person = new Person();
        String expected = "software developer";
        //when
        person.setOccupation(expected);
        //then
        String actual = person.getOccupation();
        Assert.assertEquals(expected, actual);
    }
}
