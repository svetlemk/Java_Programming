package day22_ArrayList;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test {


    public static void main(String[] args) {

        int[] num = {10, 20, 30, 40, 50, 60, 70, 80};

        boolean has25 = ArraysUtility.contains(num, 110);
        System.out.println("has25 = " + has25);


        String[] student = {"Sumaye", "Hamza", " Marika"};

        System.out.println(ArraysUtility.contains(student, "Khashir"));


        //public static int[] remove (int[] array, int index){
        int[] array1 = {10, 20, 10, 29, 17};
        int index = 3;

        int[] newArray = new int[array1.length - 1];

        for (int i = 0, j = 0; i < array1.length; i++, j++) {
            if (index == i) {
                j--;
                continue;
            }
            newArray[j] = array1[i];

        }

        System.out.println(Arrays.toString(newArray));

        int[] array2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(array2));


        int[] array3 = ArraysUtility.remove(array2, 2);

        System.out.println(Arrays.toString(array3));

        int[] array5 = {34, 35, 36, 36, 37};
        int index1 = 0;

        int[] newArray2 = new int[array1.length];

        for (int i = 0, j = 0; i < array1.length; i++, j++) {
            if (i == index1) {
                continue;
            }
            newArray2[j] = array5[i];

        }

        System.out.println(Arrays.toString(newArray2));

        //public static int[] removeDub(int[] array){
        int[] array10 = {1, 2, 3, 4, 5, 6, 1, 2, 3};

/*
        for (int i = 0; i < array10.length; i++) {
            int count = 0;
            for (int j = 0; j < array10.length; j++) {
                if (array10[i] == array10[j]) {
                    count++;
                }
                if (count > 1) {

                }*/

            }

        }

        // }







//return newArray;


//



