package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(2000);
        bankAccount.depositMoney(1000);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdrawMoney(34000);
        System.out.println(bankAccount.getBalance());
    }
}
