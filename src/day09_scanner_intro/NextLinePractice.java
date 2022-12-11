package day09_scanner_intro;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String full_name = input.nextLine();

        //input.nextLine();

        System.out.println("Enter your school name:");
        String school_name = input.nextLine();

        System.out.println("Enter your gender:");
        String gender = input.next();


        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter the street name:");
        String address = input.nextLine();

        input.close();


    }
}
