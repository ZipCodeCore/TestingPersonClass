package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String eyecolor;
    private String gender;
    private String shirtsize;
    private String height;       //short, average, tall
    private String haircolor;


    public Person(){
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

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEyeColor() {return eyecolor;}

    public String getGender() { return gender;}

    public String getShirtSize() {return shirtsize;}

    public String getHeight() {return height;}

    public String getHaircolor() {
        return haircolor;
    }

/////SETTERS

    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age;}

    public void setEyeColor(String eyecolor) {
        this.eyecolor = eyecolor;
    }

    public void setHeight(String height){
        this.height = height;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setShirtSize(String shirtsize) {this.shirtsize = shirtsize;}

    public void setHaircolor(String haircolor) { this.haircolor = haircolor; }
}

