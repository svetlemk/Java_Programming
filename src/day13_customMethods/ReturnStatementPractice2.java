package day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice2 {
    public static void main(String[] args) {

        System.out.println("Print the number: ");

        int number = new Scanner(System.in).nextInt();


        if (number < 1 || number > 7) {
            System.err.println("Invalid number: " + number);
            return;// use it to exit the method (main method here)
/// it is uses as iputting pre-condition as another way to solve the task lie that
        }

        System.out.println((number == 1) ? "Monday"
                : (number == 2) ? "Tuesday"
                : (number == 3) ? "Wednesday"
                : (number == 4) ? "Thursday"
                : (number == 5) ? "Friday"
                : (number == 6) ? "Saturday"
                : "Sunday"
        );


    }
}
