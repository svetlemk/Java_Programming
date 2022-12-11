package day09_scanner_intro;

import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// declare the variable if the data will be user later

        //new Scanner(System.in).nextInt(); if not reused

        System.out.println("Enter the day number:");

        int num = input.nextInt();

        String day = "Invalid number";

        if(num >= 1 && num <= 7){
            day = (num == 1)?"Monday":(num == 2)?"Tuesday":(num == 3)?
                    "Wednesday":(num == 4)?"Thursday":(num == 5)?"Friday":
                    (num == 6)?"Saturday":"Sunday";
        }

        System.out.println(day);

        input.close();


    }
}
