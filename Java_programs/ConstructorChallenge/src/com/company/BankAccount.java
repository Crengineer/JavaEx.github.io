package com.company;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        System.out.println("Empty account");
    }

    public BankAccount(String aN, double bal, String cN, String em, String pN){
        this.accountNumber = aN;
        this.balance = bal;
        this.customerName = cN;
        this.email = em;
        this.phoneNumber = pN;
    }

    // SET
    public void setAccountNumber(String aN){
        this.accountNumber = aN;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
    }

    public BankAccount(String accountNumber, String customerName) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
    }

    // GET
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    // Further methods
    public void depositMoney(double increment){
        this.balance += increment;
    }

    public void withdrawMoney(double withdraw){
        if(withdraw >= this.balance){
            System.out.println("Maximum value exceeded");
        } else {
            this.balance -= withdraw;
        }

    }


}
