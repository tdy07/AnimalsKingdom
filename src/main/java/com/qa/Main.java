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
//        Animal a1 = new Animal();
//        Animal a2 = new Animal("wof wof");
//        Animal a3 = new Animal(23, 42);
        Dog dog1 = new Dog("floof");
        Dog dog2 = new Dog("giraffe");
        Dog dog3 = new Dog("Matilda");
        Giraffe giraffe1 = new Giraffe(1.7);
        Giraffe giraffe2 = new Giraffe(2.0);
        Giraffe giraffe3 = new Giraffe(1.6);

        Animal[] animals = {dog1, dog2, dog3, giraffe1, giraffe2, giraffe3};
        Swimable[] dogs = {dog1, dog2, dog3};


        for (Animal animal : animals) {
            if (animal instanceof Giraffe) {
                System.out.println("I am a Giraffe with neck length, " + ((Giraffe) animal).getNeckLength() + ", my noise is " + animal.getNoise());
            } else if (animal instanceof Dog) {
                System.out.println("I am a Dog called, " + ((Dog) animal).getName() + ", my noise is " + animal.getNoise() + "swimming length");
            } else {
                System.out.println("you aren't an animal");
            }
        }

        for (Swimable dog:
             dogs) {
            System.out.println("I am a dog therefore i can swim " + dog.swimEndurance());
        }

//        System.out.println("Animal a1 age is: " + a1.getAge());
//        a1.setAge(13);
//        System.out.println("Animal a1 age is: " + a1.getAge());
//
//        System.out.println("Animal a1's noise: " + a1.getNoise());
//        System.out.println("Animal a2's noise: " + a2.getNoise());
//        System.out.println("Animal a3's noise " + a3.getNoise());
//        System.out.println("Animal a3's age is " + a3.getAge());
//        System.out.println("Animal a3's max speed is " + a3.getMaxSpeed());
//        System.out.println("Dog " + dog1.getMaxSpeed());
//
//        System.out.println(a1.toString());
//        System.out.println(a2.toString());
//        System.out.println(a3.toString());
    }

    public static void meth(String str) {
        str = str + " World!";
    }
}