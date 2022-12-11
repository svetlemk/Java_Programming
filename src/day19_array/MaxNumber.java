package day19_array;

import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {

        //int[] array1 = new int[10];
        int[] array1 = {672,789,378,3878,6789,670,343,782,678,33,333};

        int max = array1[0];

        for (int i = 1; i < array1.length; i++) {

            if(array1[i] > max){
                max = array1[i];
            }
            
        }

        System.out.println(Arrays.toString(array1));

        System.out.println("max = " + max);
        






    }
}
/*	1. Write a program
that can find the maximum
number from an array
 */

