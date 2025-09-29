package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        System.out.println("Please enter your first name:");
        Scanner nameScanner = new Scanner(System.in);
        String firstName = nameScanner.nextLine();
        System.out.println("Please enter your last name:");
        String lastName = nameScanner.nextLine();
        System.out.println("Do you have a middle name? (yes/no):");
        String middleNameCheck = nameScanner.nextLine();
        boolean middleNameBoolean = false;
        if (middleNameCheck.equalsIgnoreCase("yes") || middleNameCheck.equalsIgnoreCase("y")) {
            middleNameBoolean = true;
        } else {
            middleNameBoolean = false;
        }

        if (middleNameBoolean = true) {
            System.out.println("Please enter your middle name:");
            String middleName = nameScanner.nextLine();
        }

        System.out.println("Do you have a suffix? (yes/no)");
        String suffixCheck = nameScanner.nextLine();
        boolean suffixBoolean = false;
        if (suffixCheck.equalsIgnoreCase("yes") || suffixCheck.equalsIgnoreCase("y")) {
            suffixBoolean = true;
        } else {
            suffixBoolean = false;
        }

        if (suffixBoolean = true) {
            System.out.println("Please enter your suffix:");
            String middleName = nameScanner.nextLine();
        }



}
