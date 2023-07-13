package com.qa;

import java.util.Date;

public abstract class Animal {
    //    Constructor
    public Animal() {
    }
    public Animal(String noise) {
        this(1, 2);
    }
    public Animal(int age) {
        this(age, 2);
    }
    public Animal(int age, int maxSpeed) {
        this.age = age;
        this.maxSpeed = maxSpeed;
    }
    public Animal(int age, int maxSpeed, Date birthDate) {
        this.age = age;
        this.maxSpeed = maxSpeed;
        this.birthDate = birthDate;
    }
    //    Methods
    // Getters
    public int getAge() {
        return this.age;
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public abstract String getNoise();
    public Date getBirthDate() {
        return birthDate;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }
    // Setters
    public void setAge(int age) {
        this.age = age;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
//    public void setNoise(String noise) {
//        this.noise = noise;
//    }

    public static void setDead() {
        Animal.isAlive = false;
    }

    @Override
    public String toString() {
        return "I am "+ this.age + " with max speed of " + this.maxSpeed + " I make " + this.noise + " noise";
    }

    //    Fields
    private Date birthDate;
    private int age;
    int maxSpeed;
    private String noise;
    private static boolean isAlive = true;
}