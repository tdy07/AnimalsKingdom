package com.qa;

public class Dog extends Animal{
    //    constructors
    public Dog() {
        super(1, 5, "bark");
        this.name = "fluffy";
    }
    public Dog(String name) {
        super(10, 15, "wof wof");
        this.name = name;
    }

    public Dog(String name, String noise, int age, int maxSpeed){
        super(age, maxSpeed, noise);
        this.name = name;
    }
//    methods

    @Override
    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed * super.getAge() / 5;
    }

    //    fields
    private String name;
}