package com.bridgelabz;

import java.util.Scanner;

public class RegexLastName {
    public static void main(String[] args) {
        System.out.println("Enter the Last Name:- ");
        Scanner scan = new Scanner(System.in);
        String lastName = scan.nextLine();

        String regularExp = "^[A-Z]{1}[a-z]{2}$";

        if (lastName.matches(regularExp)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}

