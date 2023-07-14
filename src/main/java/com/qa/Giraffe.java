package com.qa;

import java.util.Date;

public class Giraffe extends Animal implements Comparable<Giraffe>{
    //    constructors
    public Giraffe(){
    }
    public Giraffe(double neckLength) {
        this(neckLength, 5);
        }

    public Giraffe(double neckLength, Date birthDate) {
         this(neckLength, birthDate, 5);
    }

    public Giraffe(double neckLength, int age) {
        this(neckLength, new Date(20, 2, 10), 5);
    }

    public Giraffe(double neckLength, Date birthDate, int age) {
        super(age, 5, birthDate);
        try{
            if (neckLength < 1) {
                throw new NeckTooShortException();
            }
            else {this.neckLength = neckLength;}

        } catch (NeckTooShortException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Great success (or not");
        }
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