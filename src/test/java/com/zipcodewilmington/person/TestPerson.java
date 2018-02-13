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
    public void testConstructorWithFiveParameters() {
        // Given
        //String socialSecurityNumber,String phoneNumber,String nationality,Integer height,String maritalStatus
        String expectedSocialSecurityNumber = "2003336545";
        String expectedPhoneNumber = "2021112222";
        String expectedNationality = "Eritrea";
        Double expectedHeight = 6.0;
        String expectedMaritalStatus = "Single";

        // When
        Person person = new Person(expectedSocialSecurityNumber, expectedPhoneNumber,expectedNationality,expectedHeight,expectedMaritalStatus);

        // Then
        String actualSocialSecurityNumber = person.getSocialSecurityNumber();
        String actualPhoneNumber = person.getPhoneNumber();
        String actualNationality = person.getNationality();
        Double actualHeight = person.getHeight();
        String actualMaritalStatus= person.getMaritalStatus();


        Assert.assertEquals(expectedSocialSecurityNumber, actualSocialSecurityNumber);
        Assert.assertEquals(expectedPhoneNumber, actualPhoneNumber);
        Assert.assertEquals(expectedNationality, actualNationality);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedMaritalStatus, actualMaritalStatus);
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
    public void testSetSocialSecurity() {
        // Given
        Person person = new Person();
        String expected = "5556667777";

        // When
        person.setSocialSecurity(expected);

        // Then
        String actual = person.getSocialSecurityNumber();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetPhoneNumber() {
        // Given
        Person person = new Person();
        String expected = "3021119999";

        // When
        person.setPhoneNumber(expected);

        // Then
        String actual = person.getPhoneNumber();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetNationality() {
        // Given
        Person person = new Person();
        String expected = "American";

        // When
        person.setSocialSecurity(expected);

        // Then
        String actual = person.getNationality();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        Double expected = 5.9;

        // When
        person.setHeight(expected);

        // Then
        Double actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

}
