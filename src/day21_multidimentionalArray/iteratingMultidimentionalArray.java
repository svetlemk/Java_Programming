package day21_multidimentionalArray;

import java.util.Arrays;

public class iteratingMultidimentionalArray {

    public static void main(String[] args) {


        int[][] array2D = {{10, 20, 30, 40}, {40, 50, 60, 70, 80}, {90, 100}}; // index : 0,1,
        for (int i = 0; i < array2D.length; i++) { // i is index of 1D array

            int[] each1D = array2D[i];
            System.out.println(Arrays.toString(each1D));

            for (int j = 0; j < each1D.length; j++) {// index of elements in each 1D ARRAY
                int eachElement = each1D[j];
                System.out.println(eachElement);
            }
        }

        System.out.println("---------------------");
        for (int [] each1Darr :array2D) {
            System.out.println(Arrays.toString(each1Darr));
            for (int eachElem : each1Darr) {
                System.out.println(eachElem);
            }
        }

        System.out.println("-------------------------------");

        for (int i = array2D.length - 1; i >= 0; i--) {
            for (int j = array2D[i].length - 1; j >= 0; j--) {
                System.out.println(array2D[i][j]);
            }
        }

        System.out.println("-----------------");

        for (int[] each1Darray :array2D) {

            for (int eachElement : each1Darray) {

                System.out.println(eachElement);

            }

        }
        
        
        

    }
}
