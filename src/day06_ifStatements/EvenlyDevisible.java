package day06_ifStatements;

public class EvenlyDevisible {
    public static void main(String[] args) {
        int num = 66;
        boolean isDivisibleBy2 = num % 2 == 0;
        boolean isDivisibleBy3 = num % 3 == 0;
        boolean isDivisibleBy5 = num % 5 == 0;

        System.out.println(num + " is divisible by two: " + isDivisibleBy2);
        System.out.println(num + " is divisible by three: " + isDivisibleBy3);
        System.out.println(num + " is divisible by five: " + isDivisibleBy5);


    }
}
/*
 3. Create a class named EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

            Evenly Divisible ==> remainder is zero
 */