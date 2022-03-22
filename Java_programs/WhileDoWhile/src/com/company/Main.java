package com.company;

public class Main {

    public static void main(String[] args) {

        int count  = 0;
        while(count != 5){
            System.out.println("Count value is: " + count);
            count ++;
        }

        for(count = 1; count != 6; count++){
            System.out.println("Count value is: " + count);
        }

        count = 1;

        while(true){
            if(count == 5)
                break;
            System.out.println("Count value is " + count);
            count++;
        }
        count = 1;
        do{
            System.out.println(count);
            count++;
        } while(count != 6);

        int number = 4;
        int finishNumber = 100;
        count =  0;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue; //bypass Sout statement, passing to the next step of the loop
            }
            System.out.println("Even number: " +number);
            count++;
            if(count == 5)
                break;
        }
    }

    public static boolean isEvenNumber(int number){
        if(number == 0)
            return false;
        if((number-1) % 2 == 0){
            return true;
        }
        return false;
    }


}
