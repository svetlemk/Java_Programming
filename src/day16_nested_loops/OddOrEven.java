package day16_nested_loops;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + "is an Even number");
            } else {
                System.out.println(number + " is an Odd number");
            }

            System.out.println("Would you like to enter another number (yes/no)");
            String answer = input.next().toLowerCase();

            while(! (answer.equals("yes") || answer.equals("no")) ){ // while it provided invalid number
                System.err.println("Would you like to enter another number (yes/no)");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")) {
                break;
            }


        }


    }
}
