package com.bridgelabz;

import java.util.Scanner;

public class RegexEmailSample {
    public static void main(String[] args) {
        System.out.println("Enter the Email Address :-");
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        String regularExp = "^(abc)[.+-]?[0-9]{0,3}(@)[a-z0-9]{1,}.[a-z]{1,}.?[a-z]{1,},?$";

        if (password.matches(regularExp)) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
