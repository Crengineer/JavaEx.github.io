package com.company;

public class Animal {
    private String name;
    private int brain, body, size, weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    //Get Methods

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    // Actions

    public void eat(){
        System.out.println("GNAM GNAM");
    }

    public void move(int speed){
        System.out.println("The animal is moving at speed: " + speed);
    }

    public void run(){

    }

}
