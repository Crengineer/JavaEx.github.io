package com.company;

public class Dog extends Animal {

    private int eyes, legs, tail, teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight){
        super(name, brain, body, size, weight);
    }

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("GROP GROP");
    }

    public void walk(){
        move(5);
    }

    public void run(){
        move(10);
    }

    @Override
    public void eat() {
        System.out.println("Dog eatingggg");
        chew();
        super.eat();
    }
}
