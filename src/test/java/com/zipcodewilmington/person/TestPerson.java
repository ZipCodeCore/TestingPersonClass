package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.table.TableColumn;

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
    public void testSetLastName() {
        // Given
        Person person = new Person();
        String expected = "Taco";
        // When
        person.setLastName(expected);
        // Then
        String actual = person.getLastName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetArms(){
        //Given
        Person person = new Person();
        Integer expected = 2;
        //When
        person.setArms(expected);
        //Then
        Integer actual = person.getArms();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetLegs(){
        //Given
        Person person = new Person();
        Integer expected = 2;
        //When
        person.setLegs(expected);
        //Then
        Integer actual = person.getLegs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyes(){
        //Given
        Person person = new Person();
        Integer expected = 2;
        //When
        person.setEyes(expected);
        //Then
        Integer actual = person.getEyes();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetFavoriteCereal(){
        //Given
        Person person = new Person();
        String expected = "Cookie Crisp ";
        //When
        person.setFavoriteCereal(expected);
        //Then
        String actual = person.getFavoriteCereal();
        Assert.assertEquals(expected, actual);
    }
}
