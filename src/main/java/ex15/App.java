/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex15;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String correctPass = "abc$123";

        System.out.print("What is your username? ");
        String username = in.nextLine();

        System.out.print("What is the password? ");
        String givenPass = in.nextLine();

        if(givenPass.compareTo(correctPass) == 0)
        {
            System.out.println("Welcome!");
        }else
            System.out.println("I don't know you.");
    }
}
