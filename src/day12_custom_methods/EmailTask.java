package day12_custom_methods;

import java.util.Scanner;

public class EmailTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter you email address: ");

        String email = input.next();
        String full_name = "";


        if (email.contains("_")) {
            String first = email.substring(0, email.indexOf("_"));
            String last = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));
            String full_email = last + "_" + first + domain;
            System.out.println(full_email);

        } else {
            System.out.println(email);
        }


    }
}
/*
 2. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */