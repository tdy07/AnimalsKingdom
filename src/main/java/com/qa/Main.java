package com.qa;

public class Main {
    public static void main(String[] args) {
//        variablesPractice();
//        newFunction();
//        incrementTest();
//        referencePractice();
//          String s = "Hello";
//          meth(s);
//          System.out.println(s);
        animalClassTest();
    }

    public static void animalClassTest(){
        Animal a1 = new Animal();
        Animal a2 = new Animal("wof wof");
        Animal a3 = new Animal(23, 42);
        Dog dog1 = new Dog("floof");
        Animal[] animals = {a1, a2, dog1};

        System.out.println("Animal a1 age is: " + a1.getAge());
        a1.setAge(13);
        System.out.println("Animal a1 age is: " + a1.getAge());

        System.out.println("Animal a1's noise: " + a1.getNoise());
        System.out.println("Animal a2's noise: " + a2.getNoise());
        System.out.println("Animal a3's noise " + a3.getNoise());
        System.out.println("Animal a3's age is " + a3.getAge());
        System.out.println("Animal a3's max speed is " + a3.getMaxSpeed());
        System.out.println("Dog " + dog1.getMaxSpeed());

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }

    public static void meth(String str) {
        str = str + " World!";
    }
}