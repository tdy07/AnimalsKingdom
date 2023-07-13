package com.qa;

import java.util.Date;

public class Giraffe extends Animal implements Comparable<Giraffe>{
    //    constructors
    public Giraffe(){
    }
    public Giraffe(double neckLength) {
        super(1, 5);
        this.neckLength = neckLength;
    }

    public Giraffe(double neckLength, Date birthDate) {
        super(1, 5, birthDate);
        this.neckLength = neckLength;
    }

    public Giraffe(double neckLength, int age) {
        super(age, 5);
        this.neckLength = neckLength;
    }

    @Override
    public String getNoise() {
        return "hummmmmmmmmmm";
    }

    @Override
    public String toString() {
        return "I am a giraffe with neck length:" + this.neckLength;
    }

    public Giraffe(String name, int age, int maxSpeed){
        super(age, maxSpeed);
    }
//    methods

    public int compareTo(Giraffe giraffe) {
        return (int)(this.neckLength - giraffe.neckLength);
    }
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