package day14_ForLoop_Overloading;

import java.util.Scanner;

public class ForLoopPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number");
            sum += input.nextInt();
        }
        System.out.println("sum = " + sum);



        // write a program that can ask the  user to enter anumber 5 times and
        // and print a maximum number


        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n1 = input2.nextInt();

        for (int num2 = 0; num2 < 5; num2++) {
            System.out.println("Enter a number:");
             n1 = input2.nextInt();

            if (num2 > num2){
                System.out.println();
            }
        }











    }


}
