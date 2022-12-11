package day07_ifStatements2;

public class MonthName {
    public static void main(String[] args) {
        int num = 12;
        String result = "";

        if ( num == 1){
            result = "January";
        }
        if ( num == 2){
            result = "February";
        }
        if ( num == 3){
            result = "March";

        }
        if ( num == 4){
            result = "April";
        }
        if ( num == 5 ){
            result = "May";
        }
        if ( num == 6){
            result = "June";
        }
        if ( num == 7){
            result = "July";
        }
        if ( num == 8){
            result = "August";
        }
        if (num == 9){
            result = "September";
        }
        if (num == 10){
            result = "October";
        }
        if ( num == 11){
            result = "November";
        }
        else {
            result = "December";
        }

        System.out.println(result);

    }
}
/*
1. Create a class named MonthName.java
2. An integer variable named number
 is declared and given, Write a
program that can print the name
 of the month that the number
represents.
Ex: Given:
number = 10
output: October
Note: Assume that the given number is between 1 ~ 12
 */