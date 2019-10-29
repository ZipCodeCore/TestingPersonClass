package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name, eyeColor, occupation;
    private Integer age, numberOfCars, numberOfPets, weightInLB;

    public Person(String expectedName, Integer expectedAge, String expectedEyeColor, Integer expectedNumberOfCars, String expectedOccupation, Integer expectedNumberOfPets, Integer expectedWeightInLB) {
        this.name = expectedName;
        this.age = expectedAge;
        this.eyeColor = expectedEyeColor;
        this.numberOfCars = expectedNumberOfCars;
        this.occupation = expectedOccupation;
        this.numberOfPets = expectedNumberOfPets;
        this.weightInLB = expectedWeightInLB;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(Integer expected) {
        this.age = expected;
    }

    public Person(String expected) {
        this.name = expected;
    }

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
