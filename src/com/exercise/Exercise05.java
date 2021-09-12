/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Here we take in the input from a user
        System.out.print("What is the first number? ");
        String Number1 = input.nextLine();
        System.out.print("What is the second number? ");
        String Number2 = input.nextLine();
        //Since we can't do math with strings, we have to convert it
        int a = Integer.parseInt(Number1);
        int b = Integer.parseInt(Number2);
        //Last we print the calculations.
        System.out.println(a + " + " + b + " = " + (a+b) + "\r\n" + a + " - " + b + " = " + (a-b) + "\r\n" + a + " * " + b + " = " + (a*b) + "\r\n" + a + " / " + b + " = " + (a/b));
    }
}
