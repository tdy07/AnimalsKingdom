package com.qa;

import java.util.*;

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
        Giraffe giraffe1 = new Giraffe(1.7, 2);
        Giraffe giraffe2 = new Giraffe(22.0, 11);
        Giraffe giraffe3 = new Giraffe(11.6, 5);
        Giraffe giraffe4 = new Giraffe(5, new Date(20, 10, 10));

        System.out.println("hgeghe" + giraffe4.getBirthDate());
        System.out.println("here" + giraffe1.compareTo(giraffe2));

//        Animal[] animals = {dog1, dog2, dog3, giraffe1, giraffe2, giraffe3};
//        Swimable[] dogs = {dog1, dog2, dog3};
        List<Giraffe> giraffes = new ArrayList<>();

        giraffes.add(giraffe1);
        giraffes.add(giraffe2);
        giraffes.add(giraffe3);
        System.out.println(giraffes);

        Collections.sort(giraffes);
        System.out.println(giraffes);


        mapGiraffe(giraffes);
//        for (Animal animal : animals) {
//            if (animal instanceof Giraffe) {
//                System.out.println("I am a Giraffe with neck length, " + ((Giraffe) animal).getNeckLength() + ", my noise is " + animal.getNoise());
//            } else if (animal instanceof Dog) {
//                System.out.println("I am a Dog called, " + ((Dog) animal).getName() + ", my noise is " + animal.getNoise() + "swimming length");
//            } else {
//                System.out.println("you aren't an animal");
//            }
//        }
//
//        for (Swimable dog:
//             dogs) {
//            System.out.println("I am a dog therefore i can swim " + dog.swimEndurance());
//        }

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

    public static void mapGiraffe(List<Giraffe> args) {
        Map<Integer, Double> map = new TreeMap<Integer, Double>();
        for (Giraffe giraffe : args) {
//            System.out.println(giraffe);
            map.put(giraffe.getAge(), giraffe.getNeckLength());
        }
        System.out.println(map);
    }
    public static void meth(String str) {
        str = str + " World!";
    }
}