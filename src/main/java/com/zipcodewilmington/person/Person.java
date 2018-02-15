package com.zipcodewilmington.person;

/**
 *
 */
public class Person {
    private String name;
    private int age;
    private  String socialSecurityNumber;
    private String phoneNumber;
    private String nationality;
    private Double height;
    private String maritalStatus;

    /**
     *
     */
    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age= age;
    }
    public Person(String socialSecurityNumber,String phoneNumber,String nationality,Double height,String maritalStatus){
        this.socialSecurityNumber=socialSecurityNumber;
        this.phoneNumber = phoneNumber;
        this.nationality=nationality;
        this.height=height;
        this.maritalStatus=maritalStatus;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {

        return name;
    }

    public Integer getAge() {

        return age;
    }
    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurityNumber = socialSecurity;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void setHeight(Double height) {
        this.height = height;
    }
    public void setMaritalStatus(String status) {
        this.maritalStatus = status;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getNationality() {
        return nationality;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Double getHeight() {
        return height;
    }
}
