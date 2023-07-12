package com.qa;

public class Giraffe extends Animal{
    //    constructors
    public Giraffe(){
    }
    public Giraffe(double neckLength) {
        super(1, 5);
        this.neckLength = neckLength;
    }

    @Override
    public String getNoise() {
        return "hummmmmmmmmmm";
    }

    public Giraffe(String name, int age, int maxSpeed){
        super(age, maxSpeed);
    }
//    methods

    @Override
    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed * super.getAge() / 20;
    }

    public double getNeckLength() {
        return neckLength;
    }

    public void setNeckLength(double neckLength) {
        this.neckLength = neckLength;
    }

    //    fields
    private double neckLength;
}