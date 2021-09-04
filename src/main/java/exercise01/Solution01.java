package exercise01;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Jaro
 */

//Create a program that prompts for your name and prints a greeting using your name.

import java.util.Scanner;

public class Solution01 {
    /*
    take a name from the user
    read the name in the command prompt
    print out the name
     */
    public static void main(String args[]){
        //take name
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name?");
        //read the name given by the user
        String name = in.nextLine();
        //print out the name
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
