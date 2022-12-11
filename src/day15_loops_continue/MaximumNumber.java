package day15_loops_continue;

import java.util.Scanner;

/*
ask user to enter 5 num and print max number
 */

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number:");
            int num = input.nextInt();

            if (num > max) {
                max = num;
            }


        }


        System.out.println("max = " + max);
        input.close();
    }




}



