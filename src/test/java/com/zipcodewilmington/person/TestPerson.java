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
        String expectedHairColor = "pink";
        String expectedBirthMonth = "March";

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName("");
        Integer actualAge = person.getAge(Integer.MAX_VALUE);
        String actualHairColor = "pink";
        String actualBirthMonth = "March";


        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedBirthMonth, actualBirthMonth);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        String actual = person.getName("Leon");

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        Integer actual = person.getAge(5);

        // Then
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
        Integer actualAge = person.getAge(5);
        String actualName = person.getName("Leon");

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
        String actual = person.getName("Leon");

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expectedAge = 5;

        // When
        person.setAge(expectedAge);
        Integer actual = person.getAge(5);

        // Then
        Assert.assertEquals(expectedAge, actual);
    }
    @Test
    public void testHairColor() {
        // Given
        Person person = new Person();
        String expected = "pink";

        // When
        String actual = person.getHairColor("pink");

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testBirthMonth() {
        // Given
        Person person = new Person();
        String expected = "March";

        // When
        person.setBirthMonth(expected);
        String actual = person.getBirthMonth();

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTalent(){
        // Given
        Person person = new Person();
        String expected = "Can Dance";

        // When
        person.setTalent("Can Dance");
        String actual = person.getTalent();

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGender(){
        // Given
        Person person = new Person();
        char expected = 'F';

        // When
        person.setGender('F');
        char actual = person.getGender();

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testNationality(){
        // Given
        Person person = new Person();
        String expected = "American";

        // When
        person.setNationality("American");
        String actual = person.getNationality();

        // Then
        Assert.assertEquals(expected, actual);
    }



}
