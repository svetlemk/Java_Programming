package day19_array;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        int[] array1 = new int[100]; // index 0-99

       /* for (int i = 0, j = 10; i < numbers.length; i++, j +=10) {
            numbers[i] = j;
        }*/

        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1; //
        }

        System.out.println("Array1 = " + Arrays.toString(array1)
        );

        System.out.println("-------------------");
        int[] arr2 = new int[100];

        /*for (int i = 0,j =100;i < arr2.length; i++, j--) {

            arr2[i] = j;

        } */


        for (int i = 0;i < arr2.length; i++) {

            arr2[i] = 100 - i; // finding the pattern vs using the second variable as above

        }

        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));


    }

}
