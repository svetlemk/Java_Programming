package day37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock2 {

    public static void main(String[] args) {

        System.out.println("Program1 started");

        int[] arr = {1, 2, 3,4};

        try{
            System.out.println(arr[1000]);
            System.out.println("Try block");
        }catch (RuntimeException e){
            e.printStackTrace(); // display the full details of the execution after the execution of program
           // e.getMessage();
            System.out.println("Catch block");
        }

        System.out.println("Program1 ended");

        System.out.println("___________");

        System.out.println("Program2 started");

        try{
            System.out.println(9/0);
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("=====================");
        System.out.println("Program starts0");
        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            System.out.println("catch block");
            e.printStackTrace();
        }
        System.out.println("program ends0");



    }
}
