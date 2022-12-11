package day16_nested_loops;

import java.util.Scanner;

public class LoopPractices {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            System.out.println("Hello" + i);

        }

        System.out.println("-------------");

        int j = 0; // using while loop as for loop function
        while(j<5){
            System.out.println("Hello" + j);
            j++;
        }

        System.out.println("--------");

        int k =0;
        do{
            System.out.println("Hello"+ k);
            k++;
        }while( k < 5);

        System.out.println("---------");

        Scanner input = new Scanner(System.in);



        System.out.println("Enter your score");
        int score = input.nextInt();

        while( score == 100 || score <0){ // while score is invalid we will ask user to re- enter
            System.out.println("Invalid, please re- enter");
            score = input.nextInt();// update the score value

        }

        if(score >= 60){
            System.out.println("Passsed");
        }else{
            System.out.println("Failed");
        }



    }
}
