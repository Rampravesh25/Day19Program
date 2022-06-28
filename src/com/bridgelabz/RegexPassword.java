package com.bridgelabz;

import java.util.Scanner;

public class RegexPassword {
    public static void main(String[] args) {
        System.out.println("Enter the 8 Digit Password:-");
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        String regularExp = "^[0-9 a-z A-Z]{8}";

        if (password.matches(regularExp)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}

