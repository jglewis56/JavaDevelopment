package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5/2;
        float myFloatValue = 5f/3;
        double myDoubleValue = 5d/3;
        System.out.println("myIntValue " + myIntValue);
        System.out.println("myFloatValue " + myFloatValue);
        System.out.println("myDoubleValue " + myDoubleValue);


        double pound;
        double kilograms;
        Scanner f = new Scanner(System.in);
        pound = f.nextDouble();
        kilograms = pound * 0.45359237;
        System.out.println("Pounds: " + pound);
        System.out.println("Kilograms: " + kilograms);

        double pi = Math.PI;
        System.out.println("Pi: " + pi);
    }
}
