package day21_multidimentionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElementToArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int element = 6;
        // expected 1,2,3,4,5,6

        int[] new_array = Arrays.copyOf(array, array.length+1);

        new_array[new_array.length-1] = element;

        System.out.println(Arrays.toString(new_array));

        int [] numbers = {10,200,300,400};
        numbers = ArraysUtility.addElement(numbers,2);


    }
}
