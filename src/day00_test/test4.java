package day00_test;

import utilities.ArraysUtility;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class test4 {

    public static void main(String[] args) {
        int[] l1 = {2, 6,-7,9,4,2}; //16
        int[] l2 = {-15,10,2,3,5,6,19}; //34
        int[] l3 = {-15,-15,5,10,2,4,5}; //30
        int[] l4 = {-1,2,-1,1,-1,1,-1}; //2
        int[] l5 = {};
        int[] l6 = {1};
        int[] l7 = {1,-34};//35

        ArrayList<Integer> newL = new ArrayList<>(Arrays.asList());




        System.out.println(Arrays.toString(l5));


        //ArrayList<int> total = new ArrayList<>(Arrays.asList(l1,l2,l3,l4,l5,l6,l7));




    }

    private static int twoSum(int[] arr) {
        int sum = 0;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = Math.abs(arr[i]);
        }
        Arrays.sort(newArr);
        System.out.println(newArr);
        newArr = Arrays.stream(newArr).distinct().toArray();
        return newArr[newArr.length - 2] + newArr[newArr.length - 1];

    }

}
