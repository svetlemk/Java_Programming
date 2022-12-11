package day06_ifStatements;

public class IdentifyNumber {
    public static void main(String[] args) {
        int num = 200;
        boolean isNegative = num < 0;
        boolean isPositive = num > 0;
        //boolean isZero = num == 0;
        boolean isZero = !isNegative && !isPositive;

        System.out.println( num + " is positive number: " + isPositive);
        System.out.println(num + " is negative number: " + isNegative);
        System.out.println(num + " is zero: " + isZero);



    }
}
/*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */