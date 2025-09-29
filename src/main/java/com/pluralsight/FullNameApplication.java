package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        System.out.println("Please enter your first name:");
        Scanner nameScanner = new Scanner(System.in);
        String firstName = nameScanner.nextLine();
        firstName = firstName.trim();
        System.out.println("Please enter your last name:");
        String lastName = nameScanner.nextLine();
        lastName = lastName.trim();
        System.out.println("Do you have a middle name? (yes/no):");
        String middleNameCheck = nameScanner.nextLine();
        boolean middleNameBoolean = false;
        String middleName = "";
        if (middleNameCheck.equalsIgnoreCase("yes") || middleNameCheck.equalsIgnoreCase("y")) {
            middleNameBoolean = true;
        } else {
            middleNameBoolean = false;
        }

        if (middleNameBoolean == true) {
            System.out.println("Please enter your middle name:");
            middleName = nameScanner.nextLine();
        }
        middleName = middleName.trim();

        System.out.println("Do you have a suffix? (yes/no)");
        String suffixCheck = nameScanner.nextLine();
        boolean suffixBoolean = false;
        String suffixName = "";
        if (suffixCheck.equalsIgnoreCase("yes") || suffixCheck.equalsIgnoreCase("y")) {
            suffixBoolean = true;
        } else {
            suffixBoolean = false;
        }

        if (suffixBoolean == true) {
            System.out.println("Please enter your suffix:");
            suffixName = nameScanner.nextLine();
        }

        suffixName = suffixName.trim();
        suffixName = ", " + suffixName;

        String fullName = "";

        if (suffixBoolean && middleNameBoolean) {
            fullName = firstName + " " + middleName + " " + lastName + suffixName;
        } else if (suffixBoolean && middleNameBoolean == false) {
            fullName = firstName + " " + lastName + suffixName;
        } else if (suffixBoolean == false && middleNameBoolean) {
            fullName = firstName + " " + middleName + " " + lastName;
        } else {
            fullName = firstName + " " + lastName;
        }
        System.out.println("You full name is: "+ fullName);
        }
    }
