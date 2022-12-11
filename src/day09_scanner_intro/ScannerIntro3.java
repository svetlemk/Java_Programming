package day09_scanner_intro;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);

        //System.out.println("Enter a character:");
        //char ch = intro.next().charAt(0);

        //System.out.println("You have entered: "+ ch);

        System.out.println("Please enter a name:");
        //String name = intro.next();
        String name = intro.nextLine();

        System.out.println("You have entered: " + name );


    }
}
