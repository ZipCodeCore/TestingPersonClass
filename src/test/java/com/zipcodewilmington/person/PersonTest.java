package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getHeight() {
        // Given
        Person person = new Person();
        String expected = "Baltimore";

        // When
        person.setCity(expected);
        String actual = person.getCity();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCity() {
        // Given
        Person person = new Person();
        Integer expected = 51;

        // When
        person.setHeight(expected);
        Integer actual = person.getHeight();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getState() {
        // Given
        Person person = new Person();
        String expected = "Maryland";

        // When
        person.setState(expected);
        String actual = person.getState();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isStudent() {
        // Given
        Person person = new Person();
        boolean expected = true;

        // When
        person.setStudent(expected);
        Boolean actual = person.isStudent();

        // Then
        Assert.assertEquals(expected, actual);
    }
}