package com.qa;

public class Animal {
    //    Constructor
    public Animal() {
        this.noise = "";
    }
    public Animal(String noise) {
        this(1, 2, noise);
    }
    public Animal(int age) {
        this(age, 2, "bow bow");
    }
    public Animal(int age, int maxSpeed) {
        this(age, maxSpeed, "bow bow");
    }
    public Animal(int age, int maxSpeed, String noise) {
        this.age = age;
        this.maxSpeed = maxSpeed;
        this.noise = noise;
    }
    //    Methods
    // Getters
    public int getAge() {
        return this.age;
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public String getNoise() {
        return this.noise;
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
    public void setNoise(String noise) {
        this.noise = noise;
    }

    public static void setDead() {
        Animal.isAlive = false;
    }

    @Override
    public String toString() {
        return "I am "+ this.age + " with max speed of " + this.maxSpeed + " I make " + this.noise + " noise";
    }

    //    Fields
    private int age;
    int maxSpeed;
    private String noise;
    private static boolean isAlive = true;
}