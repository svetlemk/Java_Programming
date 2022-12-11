package day15_loops_continue;

import java.util.Scanner;

public class WhileLoopEligibleToVote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age?");
        int age = input.nextInt();

        while (!(age >= 1 && age <= 150)) {
            System.err.println("Invalid entry, please re-enter your age?");
            age = input.nextInt();
        }

        System.out.println("Are you a US citizen? Yes/ No");
        String yesOrNo = input.next().toLowerCase();

        while (!(yesOrNo.equals("yes") || yesOrNo.equals("no"))) {
            System.err.println("Invalid entry, please re-enter");
            System.out.println("Are you a US citizen? Yes/ No");
            yesOrNo = input.next().toLowerCase();
        }


        if (age >= 18 && age <= 150 && yesOrNo.equals("yes")) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
        input.close();


    }
}
