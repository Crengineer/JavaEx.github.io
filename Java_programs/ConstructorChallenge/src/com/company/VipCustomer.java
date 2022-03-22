package com.company;

public class VipCustomer {

    private String name;
    private String email;
    private double creditLimit;

    //SET

    public VipCustomer(String name) {
        this.name = name;
    }


    public VipCustomer(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public VipCustomer(String email, double creditLimit) {
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(){
        this.name = "Bobo";
        this.email = "Vieri@it.com";
        this.creditLimit = 20000;
    }
}
