package day21_multidimentionalArray;

import java.util.Arrays;

public class MultiDimentionalArrayIntro {


    public static void main(String[] args) {

        int[] arr1 ={10,20,30};
        int[] arr2 = {40,50,60,70,80};
        int[] arr3 = {90,100};

        System.out.println("-------------------");

        int[][] array2D = {{10,20,30,40},{40,50,60,70,80},{90,100}}; // index : 0,1,
        //index                  0             1               2

        System.out.println(array2D[1][0]);//40

        System.out.println(array2D.length);




    }


}
