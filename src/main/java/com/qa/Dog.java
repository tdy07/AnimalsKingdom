package com.qa;

public class Dog extends Animal{
    //    constructors
    public Dog() {
        super(1, 5);
        this.name = "fluffy";
    }
    public Dog(String name) {
        super(10, 15);
        this.name = name;
    }

    @Override
    public String getNoise() {
        return "woof~ish";
    }

    public Dog(String name, int age, int maxSpeed){
        super(age, maxSpeed);
        this.name = name;
    }
//    methods

    @Override
    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed * super.getAge() / 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    fields
    private String name;
}