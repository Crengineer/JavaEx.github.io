package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Doggo",1,1,30, 40);
        Dog doggo = new Dog("Celeste", 1, 1, 20, 20, 2, 1, 1, 32, "Brown");
        doggo.eat();
        doggo.walk();
    }
}
