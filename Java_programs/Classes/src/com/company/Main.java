package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.model = "Carrera";
        porsche.setModel("Carrera");
        System.out.println(porsche.getModel());

    }
}
