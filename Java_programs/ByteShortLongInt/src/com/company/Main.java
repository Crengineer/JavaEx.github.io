package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);
        System.out.println("Busted MAX Value: " + (myMaxIntValue + 1));
        System.out.println("Busted MIN Value: " + (myMinIntValue - 1));

        int myIntValue =21_7483_47;
        System.out.println(myIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value: " + myMinByteValue);
        System.out.println("Byte Maximum Value: " + myMaxByteValue);
        System.out.println("Busted Byte MAX Value: " + (myMaxByteValue + 1));
        System.out.println("Busted Byte MIN Value: " + (myMinByteValue - 1));


        short myMinshortValue = Short.MIN_VALUE;
        short myMaxshortValue = Short.MAX_VALUE;
        System.out.println("short Minimum Value: " + myMinshortValue);
        System.out.println("short Maximum Value: " + myMaxshortValue);
        System.out.println("Busted short MAX Value: " + (myMaxshortValue + 1));
        System.out.println("Busted short MIN Value: " + (myMinshortValue - 1));

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value: " + myMinLongValue);
        System.out.println("Long Maximum Value: " + myMaxLongValue);
        System.out.println("Busted Long MAX Value: " + (myMaxLongValue + 1));
        System.out.println("Busted Long MIN Value: " + (myMinLongValue - 1));

        //long myLongValue = 922_372_36854_75807L;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinshortValue / 2);




    }
}
