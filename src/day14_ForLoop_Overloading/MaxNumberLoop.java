package day14_ForLoop_Overloading;

public class MaxNumberLoop {

    public static void main(String[] args) {





    }
}
/*
"Write a program that can ask the user
 to enter a number for 5 times and returns the maximum number".
 I understand this question to enter same number
 for 5 times. I was thinking how can I find the Max by entering it for 5 times?@Muhtar


Muhtar: create a temporary variable before the loop
( to store the maximum number at the end) and then as
 soon as the user enters the first number if it can be
 assigned to the variable itself then we can compare it
 with the next input and whichever is bigger can be
reassigned to the variable... this step need to be
continued for rest of the inputs

Daurin:
package day14_forLoop;
import java.util.Scanner;
public class MaxNumber {
    public static void main(String[] args) {
        maxNumber();    }
    public static void maxNumber() {
        int maximum = Integer.MIN_VALUE,
            number;
        System.out.println("Enter your 5 numbers:");
        for (int i = 1; i <= 5; i++) {
            number = new Scanner(System.in).nextInt();
            maximum = (maximum > number) ? maximum : number; }
        System.out.println(maximum + " is your max number"); }
}
   public static void main(String[] args) {
        /*
        1 write a program that can ask the user enter to enter a number for five times, print the maximum number
        I write a program that can ask the user enter to enter a number for five times, print the minimum number

      /*

    Scanner input = new Scanner(System.in);
    int x=0; // to contain the maximum number
        for (int i = 1; i <=5; i++){
                System.out.println("Enter a number");
                int number = input.nextInt();
                if(number>x){ // compare each time x to the new provided number
                x= number; // assign number if greater than x
                }
                }
                System.out.println(x);

                int y=0;
                for (int i=1; i <= 5; i++){
                System.out.println("Enter a number");
                int number = input.nextInt();
                if(i==1) {
                y = number;//assign y the first value of entered number to avoid getting y=0
                }else if(number<y){// compare each time y to the new provided number
        y=number; // assign number if less than y
        }

        }
        System.out.println(y);
        }



 */