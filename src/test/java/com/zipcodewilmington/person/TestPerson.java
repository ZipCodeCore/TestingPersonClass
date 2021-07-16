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
        Person person = new Person(expectedName, expectedAge);

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
        //Person person = new Person();
        String expected = "Leon";

        // When
        Person person = new Person(expected);
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void testSetAge() {
        // Given
        //Person person = new Person();
        Integer expected = 5;

        // When
        Person person = new Person(expected);
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testHairColorTest() {
        //GIVEN
        String expected = "blue";

        //WHEN
        Person person = new Person(expected);
        person.setHairColor(expected);
        String actual = person.getHairColor();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setHaitTest(){
        //GIVEN
        int expected = 4;

        //WHEN
        Person person = new Person(expected);
        person.setHait(expected);
        int actual = person.getHait();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNationalityTest(){
        //GIVEN
        String expected = "Mexico";

        //WHEN
        Person person = new Person(expected);
        person.setNationality(expected);
        String actual = person.getNationality();

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setFavoriteColorTest(){
        //GIVEN
        String expected = "pink";
        //WHEN
        Person person = new Person(expected);
        person.setFavoriteColor(expected);
        String actual = person.getFavoriteColor();
        //THEN
        Assert.assertEquals(expected, actual);

    }



    @Test
    public void SetFavoriteSong(){
        //GIVEN
        String expected = "Dynamite";
        //WHEN
        Person person = new Person(expected);
        person.setFavoriteSong(expected);
        String actual = person.getFavoriteSong();
        //THEN
        Assert.assertEquals(expected, actual);
    }



}
