package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float maximum value: " + myMaxFloatValue);
        System.out.println("Float minimum value: " + myMinFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double maximum value: " + myMaxDoubleValue);
        System.out.println("Double minimum value: " + myMinDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5F / 3F;
        double myDoubleValue = 5d / 3D;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        // Convert from pound to kilograms knowing: 1 pound = 0.45359237 kg

        double kg = 3d;
        double pound = 0.45359237d * kg;
        System.out.println("The value is: " + pound);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;

        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
