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
        String expectedName = "no name";
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
    public void constructorTestNameAgeAndNationality(){
        int expectedAge = 20;
        Person person = new Person("jeff", 20, "French");
        int actualAge = person.getAge();
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void constructorTestNameAgeDefaultValueOverrideTest(){
        Person person = new Person("jeff", 20, "French");
        Assert.assertFalse(person.isWearsGlasses());
    }

    @Test
    public void constructorTestNameAgeNationalityAndJob(){
        Person person = new Person("jeff", 20, "French", "Writer");
        Assert.assertEquals("Writer", person.getJob());
    }

    @Test
    public void constructorTestNameAgeNationalityJobAndGlasses(){
        Person person = new Person("jeff", 20, "French", "Writer", true);
        Assert.assertTrue(person.isWearsGlasses());
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
    public void testSetNationality(){
        Person person = new Person();
        String expected = "American";
        person.setNationality(expected);
        String actual = person.getNationality();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetJob(){
        Person person = new Person();
        String expected = "Programmer";
        person.setJob(expected);
        String actual = person.getJob();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWearsGlasses(){
        Person person = new Person();
        boolean expected = false;
        person.setWearsGlasses(expected);
        boolean actual = person.isWearsGlasses();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNationality(){
        Person person = new Person();
        String expected = "French";
        person.setNationality(expected);
        Assert.assertEquals(expected, person.getNationality());
    }

    @Test
    public void getNameTest(){
        String expected = "jeff";
        Person jeff = new Person(expected);
        String actual = jeff.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAgeTest(){
        int expected = 20;
        Person jeff = new Person(20);
        int actual = jeff.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNationalityTest(){
        String expected = "Canadien";
        Person jeff = new Person("jeff", 20, "Canadien");
        String actual = jeff.getNationality();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getJobTest(){
        String expected = "Coder";
        Person jeff = new Person("jeff", 20, "Canadien", "Coder");
        String actual = jeff.getJob();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isWearsGlassesTest(){
        boolean expected = false;
        Person jeff = new Person("jeff",20, "Canadien", "Coder", false);
        boolean actual = jeff.isWearsGlasses();
        Assert.assertEquals(expected, actual);
    }

}
