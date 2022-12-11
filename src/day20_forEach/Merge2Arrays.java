package day20_forEach;

import java.util.Arrays;
import utilities.ArraysUtility;

public class Merge2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};

        int[] arr3 = new int[arr1.length + arr2.length];

        int k = 0; // to track index number for total array index numbers

        for (int i = 0; i < arr1.length; i++,k++) {
          arr3[k] =arr1[i];
        }

        for (int i = 0; i < arr2.length; i++,k++) {
            arr3[k] = arr2[i];

        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("-----------------");


        int[] a1 = { 12,443,566,7553,};
        int[] a2 = {3,4,5,6,7,7};

        int[] a3 = ArraysUtility.merge(a1,a2);

        System.out.println( Arrays.toString(a3));

        double[] b1 = {10.5, 5.5, 3.5,6.5,8.5};
        double[] b2 = {20.5,15.5,13.5};

        double[] b3 = ArraysUtility.merge(b1,b2);

        System.out.println(Arrays.toString(b3));

        System.out.println("---------------------------******");

        char[] ch1 = {'a','b','c','d'};
        char[] ch2 = {'s','f','d'};

        char[] ch3 = ArraysUtility.merge(ch1,ch2);

        System.out.println(Arrays.toString(ch3));

        System.out.println("------------------");

        String[] c1 = {"Java", "Python", "JavaScript", "Ruby"};
        String[] c2= {"C#", "C++", "Swift" };

        String[] c3 = ArraysUtility.merge(c1,c2);

        System.out.println(Arrays.toString(c3));




        /*
        2. write a program that can merge
         two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}

         */
    }


}
