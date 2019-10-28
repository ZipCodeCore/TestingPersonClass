package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private Integer age;
    private String eyeColor;
    private Integer numberOfCars;
    private String occupation;
    private Integer numberOfPets;
    private Integer weightInLB;

    public Person(String expectedName, Integer expectedAge, String expectedEyeColor, Integer expectedNumberOfCars, String expectedOccupation, Integer expectedNumberOfPets, Integer expectedWeightInLB) {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.eyeColor = "";
        this.numberOfCars = Integer.MAX_VALUE;
        this.occupation = "";
        this.numberOfPets = Integer.MAX_VALUE;
        this.weightInLB = Integer.MAX_VALUE;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() { }

    public Person(Integer expected) { }

    public Person(String expected) { }

    public void setName(String name) { this.name = name; }

    public void setAge(Integer age) { this.age = age; }

    public void setEyeColor(String eyeColor){ this.eyeColor = eyeColor; }

    public void setNumberOfCars(Integer numberOfCars){ this.numberOfCars = numberOfCars; }

    public void setOccupation(String occupation){ this.occupation = occupation; }

    public void setNumberOfPets(Integer numberOfPets) { this.numberOfPets = numberOfPets; }

    public void setWeightInLB(Integer weightInLB) { this.weightInLB = weightInLB; }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEyeColor() {return eyeColor;}

    public Integer getNumberOfCars() {return numberOfCars;}

    public String getOccupation() {return occupation;}

    public Integer getNumberOfPets() {return numberOfPets;}

    public Integer getWeightInLB() {return weightInLB;}
}
