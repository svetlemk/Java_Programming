package day09_scanner_intro;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {


Scanner input = new Scanner(System.in);

        System.out.println("Input a number");

int number = input.nextInt();

        String oddOrEven = "Invalid number";

        if(number >= 0){
            if(number % 2 == 0) {
                oddOrEven = "The number is even";
            } else {
            oddOrEven = "The number is odd";}
}

        System.out.println(oddOrEven);

        input.close();





    }

}
