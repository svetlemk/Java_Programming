package day09_scanner_intro;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);// for reading the keyboard input

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");

        byte num1 = input.nextByte();

        System.out.println("Enter your second number: ");

        short num2 = input.nextShort();

        System.out.println("Enter your third number: ");

        int num3 = input.nextInt();

        System.out.println("Enter your forth number: ");

        long num4 = input.nextLong();

        input.close();



        System.out.println("You entered: " + num1);
        System.out.println("Second number is: "+num2);
        System.out.println("Third number is: "+num3);
        System.out.println("Forth number is: " + num4);














    }




}
