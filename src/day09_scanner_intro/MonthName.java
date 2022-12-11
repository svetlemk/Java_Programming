package day09_scanner_intro;

import java.util.Scanner;

public class MonthName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month number: ");

        int month = input.nextInt();

        String result = "Invalid month";


        if (month >= 1 && month <= 12) {
            if (month == 1) result = "Jan";
            else if (month == 2) result = "Feb";
            else if (month == 2) result = "March";
            else if (month == 2) result = "April";
            else if (month == 2) result = "May";
            else if (month == 2) result = "June";
            else if (month == 2) result = "July";
            else if (month == 2) result = "Aug";
            else if (month == 2) result = "Sept";
            else if (month == 2) result = "Oct";
            else if (month == 2) result = "Nov";
            else  result = "December";
            }

        System.out.println(result);

        input.close();

    }
}

