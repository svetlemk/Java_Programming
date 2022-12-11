package day09_scanner_intro;

import java.util.Scanner;

public class eligibleOrNot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please provide your age:");

        int age = input.nextInt();

        String eligibility = "";

        if (age >= 1 && age <= 150) {
            if (age >= 21) {eligibility = "Eligible";
            }else {eligibility = "Not Eligible";}

        } else { eligibility = "Invalid age";}

        input.close();

        System.out.println(eligibility);
    }




    }



