package com.company;

public class Main {

    public static void main(String[] args) {
        int summatory = 0;
        int counter = 0;
        for(int i=1; i<= 1000; i++){
            if(dividedByThreeAndFive(i)){
                System.out.println(i);
                summatory += i;
                counter ++;

            }
            if(counter == 5){
                break;
            }
        }
        System.out.println(summatory);


    }

    public static boolean dividedByThreeAndFive(int n){
        if((n % 3 == 0) && (n % 5 == 0)){
            return true;
        }
        return false;
    }
}
