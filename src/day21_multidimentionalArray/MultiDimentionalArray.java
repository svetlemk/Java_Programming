package day21_multidimentionalArray;

import java.util.Arrays;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        int[][] arr2D1 = {  {1,2} , {3,4,5} };
        int[][] arr2D2 = {  {6,7,8,9} , {10,11}, {12,13,13}};
        int[][] arr2D3 = {  {15,16,17,18} ,{ 19,20,21} };

int [][][] arr3D= {   {{1,2}  , {3,4}, {5,6,7}  }, {{8,9,10},{11}} };


        System.out.println(Arrays.deepToString(arr3D[1]));
    }
}
