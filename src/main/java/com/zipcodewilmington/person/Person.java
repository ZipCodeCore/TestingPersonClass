package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String nationality;
    private String job;
    private boolean wearsGlasses;

    public Person(String name, int age, String nationality, String job, boolean wearsGlasses) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.job = job;
        this.wearsGlasses = wearsGlasses;
    }

    public Person(String name){
        this(name, 0, "nowhere", "unemployed", false);
    }

    public Person(String name, int age){
        this(name, age, "nowhere", "unemployed", false);
    }

    public Person(String name, int age, String nationality){
        this(name, age, nationality, "unemployed", false);
    }

    public Person(String name, int age, String nationality, String job){
        this(name, age, nationality, job, false);
    }

    public Person(String name, String nationality, String job){
        this(name, 0, nationality, job, false);
    }

    public Person(String name, String nationality, boolean wearsGlasses){
        this(name,0, nationality, "unemployed", wearsGlasses);
    }

    public Person(int age){
        this("no name", age, "nowhere", "unemployed", false);
    }

    public Person(){
        this.name = "no name";
        this.age = 0;
        this.nationality = "nowhere";
        this.job = "unemployed";
        this.wearsGlasses = false;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public boolean isWearsGlasses() {
        return wearsGlasses;
    }

    public void setWearsGlasses(boolean wearsGlasses) {
        this.wearsGlasses = wearsGlasses;
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


}
