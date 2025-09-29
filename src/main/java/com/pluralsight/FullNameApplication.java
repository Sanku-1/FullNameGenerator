package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        System.out.println("Please enter your full name:");
        Scanner nameScanner = new Scanner(System.in);
        String inputName = nameScanner.nextLine();
        System.out.println(inputName);

    }
}
