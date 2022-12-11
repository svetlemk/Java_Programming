package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int[] reverse = new int[numbers.length];

        for (int i = numbers.length - 1, j= 0; i >= 0; i--, j++) {

            reverse[j] = numbers[i];

        }

        System.out.println(Arrays.toString(reverse));

        System.out.println("-------------------");

        double[] a1 = {433,432.5,322.4,33};

        System.out.println(Arrays.toString(ArraysUtility.reverse(a1)));
        
        
        
        
        
  /*
   Write a program that can reverse 
   an array of integers and returns it as new array
	   ex:
	array = {1,2,3,4,5};

	 output:
	reversedArray = {5,4,3,2,1};      
   */

    }
}
