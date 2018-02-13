package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String favoriteColor;
    private int timesBeenToMars;
    private boolean hasArms;

    private static final int fDEFAULT_AGE = Integer.MAX_VALUE;
    private static final String fDEFAULT_NAME = "";
    private static final String fDEFAULT_FAVCOLOR = "";
    private static final int fDEFAULT_TIMES_BEEN_TO_MARS = 0;
    private static final boolean fDEFAULT_HAS_ARMS = true;

    public Person() {
       this(fDEFAULT_NAME, fDEFAULT_AGE);
    }

    public Person(int age) {
        this(fDEFAULT_NAME, age);
    }

    public Person(String name) {
        this(name, fDEFAULT_AGE);
    }

    public Person(String name, int age) {
        setAge(age);
        setName(name);
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

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public int getTimesBeenToMars() {
        return timesBeenToMars;
    }

    public void setTimesBeenToMars(int timesBeenToMars) {
        this.timesBeenToMars = timesBeenToMars;
    }

    public boolean isHasArms() {
        return hasArms;
    }

    public void setHasArms(boolean hasArms) {
        this.hasArms = hasArms;
    }
}
