package day15_loops_continue;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number:");
        double n1 = input.nextDouble();

        System.out.println("Enter your second number:");
        double n2 = input.nextDouble();

        System.out.println("Enter your math operator:");
        char operator = input.next().charAt(0);

        while ( !(operator == '-' || operator == '+' ||operator == '*' || operator == '/')){
            System.err.println("Invalid operator, please re- enter your operator:");
           operator =  input.next().charAt(0);
        }

        if (operator == '+'){
            System.out.println(n1 + n2);
        } else if (operator == '-'){
            System.out.println(n1 - n2);
        }else if(operator == '*'){
            System.out.println(n1 * n2);
        }else{
            System.out.println(n1/n2);
        }








    }
}
