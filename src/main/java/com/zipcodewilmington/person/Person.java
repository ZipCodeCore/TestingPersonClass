package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String color;
    private String food;
    private String movie;
    private int number;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
        color = "green";
        food = "pizza";
        movie = "Hidden Figures";
        number = 3;

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

    public void setColor(String color){

        this.color = color;
    }

    public void setFood(String food){
        this.food = food;
    }

    public String getMovie(){
        return this.movie;
    }

    public Integer getNumber(){
        return this.number;
    }

    public String getColor() {
        return this.color;
    }

    public String getFood(){
        return this.food;
    }

    public void setMovie(String expected) {
        this.movie = movie;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
