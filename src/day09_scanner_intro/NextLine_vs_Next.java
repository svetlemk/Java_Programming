package day09_scanner_intro;

import java.util.Scanner;

public class NextLine_vs_Next {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine();// to take out the enter key created by previous methos
        // it was created by nextLine() method.

        System.out.println("Enter your full name:");
        String name = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("name = " + name);




    }
}
