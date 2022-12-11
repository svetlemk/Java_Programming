package day11_string_continue;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String first = input.next();

        System.out.println("Enter the second string:");
        String second = input.next();

        input.close();

        if(first.length() > second.length()){
            System.out.println("First string is longer");
        }else if(first.length() < second.length()){
            System.out.println("Second string is longer");
        }else{
            System.out.println("both string are equal");
        }



    }


}

/*

1. Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the
			longest string, if both have the same number
			 of characters then print "Equal"
 */