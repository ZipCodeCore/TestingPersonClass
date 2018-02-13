package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String skinColor;
    private int heightInFeet;
    private int weightInPounds;

    public Person() {
        //initialize variables
        name = "";
        age = Integer.MAX_VALUE;
        heightInFeet = 6;
        weightInPounds = 145;
        skinColor = "Brownie baby";
        }

        public Person(int age) {
            this.age = age;
        }

        public Person(String name) {
            this.name = name;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public Integer getAge() {
            return this.age;
        }

        public void setSkinColor(String skinColor) {
            this.skinColor = skinColor;
        }

        public void setHeightInFeet(int heightInFeet) {
            this.heightInFeet = heightInFeet;
        }

        public void setWeightInPounds(int weightInPounds) {
            this.weightInPounds = weightInPounds;
        }

        public String getSkinColor() {
            return this.skinColor;
    }

        public Integer getHeightInFeet() {
            return this.heightInFeet;
    }

        public Integer getWeightInPounds() {
            return this.weightInPounds;
    }
}