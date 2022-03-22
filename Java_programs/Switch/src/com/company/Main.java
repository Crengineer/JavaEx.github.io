package com.company;

public class Main {

    public static void main(String[] args) {
/*
        int value = 2;
        if(value == 1){
            System.out.println("Value was 1");
        } else if(value == 2){
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }
*/
        int switchValue = 3;

        switch(switchValue) {

            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char switchCharCase = 'A';

        switch (switchCharCase){
            case 'A':
                System.out.println(switchCharCase);
                break;
            case 'B':
                System.out.println(switchCharCase);
                break;
            case 'C':
                System.out.println(switchCharCase);
                break;
            case 'D':
                System.out.println(switchCharCase);
                break;
            case 'E':
                System.out.println(switchCharCase);
                break;
            default:
                System.out.println("O");
                break;

        }

    }


}
